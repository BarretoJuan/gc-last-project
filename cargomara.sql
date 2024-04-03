-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 03-04-2024 a las 21:44:12
-- Versión del servidor: 10.4.32-MariaDB
-- Versión de PHP: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `cargomara`
--
CREATE DATABASE IF NOT EXISTS `cargomara` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;
USE `cargomara`;

DELIMITER $$
--
-- Funciones
--
CREATE DEFINER=`root`@`localhost` FUNCTION `delete_report` (`preport_id` INT(11)) RETURNS INT(1)  BEGIN

DECLARE unanswered INT DEFAULT 0;

		SELECT status_rep INTO unanswered FROM reports WHERE preport_id = id;
        
        IF unanswered = 1 THEN
        	return 1;
        ELSE
        	UPDATE reports SET status_rep = 2 WHERE preport_id = id;
            	return 0;
        END IF;
        




END$$

CREATE DEFINER=`root`@`localhost` FUNCTION `insert_admin` (`pname` VARCHAR(50), `pci` VARCHAR(10), `pemail` VARCHAR(50), `ppassword_hash` VARCHAR(255), `pusername` VARCHAR(30)) RETURNS INT(1)  BEGIN
DECLARE same_ci int(10);
DECLARE same_email int(10);
DECLARE same_username int(10);


	SELECT COUNT(*) INTO same_ci FROM admin WHERE pci = ci; 
    SELECT COUNT(*) INTO same_email FROM admin WHERE pemail = email; 
    SELECT COUNT(*) INTO same_username FROM admin WHERE pusername = username;
    
    IF same_ci > 0 THEN
		return 1;
    ELSEIF same_email > 0 THEN
    	return 2;
    ELSEIF same_username > 0 THEN
    	return 3;
    END IF;
    
	INSERT INTO admin(name, ci, password_hash, username, email) 
	VALUES (pname, pci, ppassword_hash, pusername, pemail); 
	return 0;








END$$

CREATE DEFINER=`root`@`localhost` FUNCTION `insert_answer` (`pbody_text` TEXT, `preport_id` INT(11), `padmin_id` INT(11)) RETURNS INT(1)  BEGIN

DECLARE not_empty INT DEFAULT 0;

	SET not_empty = LENGTH(pbody_text);
    
    IF not_empty = 0 THEN
    	return 1;
    ELSE
    	INSERT INTO answers(body_text, report_id, admin_id) 
        VALUES(pbody_text, preport_id, padmin_id);
        UPDATE reports SET status_rep = 1 WHERE preport_id = id;
    END IF;
    
    return 0;




END$$

CREATE DEFINER=`root`@`localhost` FUNCTION `insert_report` (`ptype` INT(1), `ptitle` VARCHAR(50), `pbody_text` TEXT, `pcontact_phone` VARCHAR(15), `puser_id` INT(11)) RETURNS INT(1)  BEGIN

DECLARE not_empty INT DEFAULT 0;

	SET not_empty = LENGTH(pbody_text);
    
    IF not_empty = 0 THEN
    	return 1;
    END IF;
    
    INSERT INTO reports(type, title, body_text, contact_phone, user_id)
  	VALUES (ptype, ptitle, pbody_text, pcontact_phone, puser_id);
    return 0;

END$$

CREATE DEFINER=`root`@`localhost` FUNCTION `insert_user` (`pname` VARCHAR(50), `pci` VARCHAR(10), `ppassword_hash` VARCHAR(255), `pusername` VARCHAR(30), `pemail` VARCHAR(50)) RETURNS INT(1)  BEGIN

DECLARE same_ci int(2); 
DECLARE same_email int(2);
DECLARE same_username int(2);

	SELECT COUNT(*) INTO same_ci FROM users WHERE pci = ci; 
    SELECT COUNT(*) INTO same_email FROM users WHERE pemail = email; 
    SELECT COUNT(*) INTO same_username FROM users WHERE pusername = username; 

	IF same_ci > 0 THEN
		return 1;
    ELSEIF same_email > 0 THEN
    	return 2;
    ELSEIF same_username > 0 THEN
    	return 3;
    END IF;
    
	INSERT INTO users(name, ci, password_hash, username, email) 
	VALUES (pname, pci, ppassword_hash, pusername, pemail); 
	return 0;
    
END$$

CREATE DEFINER=`root`@`localhost` FUNCTION `login_admin` (`ppassword_hash` VARCHAR(255), `pusername` VARCHAR(30)) RETURNS INT(1)  BEGIN
DECLARE user_exist INT DEFAULT 0;
DECLARE pass_match INT DEFAULT 0;

	SELECT COUNT(*) INTO user_exist FROM admin WHERE pusername = username;
    SELECT COUNT(*) INTO pass_match FROM admin WHERE pusername = username AND ppassword_hash = password_hash; 
            
	
	IF user_exist = 1 THEN
        	IF pass_match = 1 THEN
            	return 0;
            ELSE
            	return 2;
            END IF;
    ELSE
    	return 1;
    END IF;


END$$

CREATE DEFINER=`root`@`localhost` FUNCTION `login_user` (`ppassword_hash` VARCHAR(255), `pusername` VARCHAR(30)) RETURNS INT(1)  BEGIN
DECLARE user_exist INT DEFAULT 0;
DECLARE pass_match INT DEFAULT 0;

	SELECT COUNT(*) INTO user_exist FROM users WHERE pusername = username;
    SELECT COUNT(*) INTO pass_match FROM users WHERE pusername = username AND ppassword_hash = password_hash; 
            
	
	IF user_exist = 1 THEN
        	IF pass_match = 1 THEN
            	return 0;
            ELSE
            	return 2;
            END IF;
    ELSE
    	return 1;
    END IF;


END$$

CREATE DEFINER=`root`@`localhost` FUNCTION `modify_admin` (`pname` VARCHAR(50), `ppassword_hash` VARCHAR(255), `pusername` VARCHAR(30), `pemail` VARCHAR(50), `padmin_id` INT(11)) RETURNS INT(1)  BEGIN

  DECLARE same_email INT DEFAULT 0;
    DECLARE same_username INT DEFAULT 0;

  SELECT COUNT(*) INTO same_email FROM admin WHERE pemail = email AND id != padmin_id;
    SELECT COUNT(*) INTO same_username FROM admin WHERE pusername = username AND id != padmin_id;
    
    IF same_email > 0 THEN
      return 1;
    ELSEIF same_username > 0 THEN
      return 2;
    ELSE
      UPDATE admin 
    SET name = pname,
        email = pemail,
      password_hash = ppassword_hash, 
      username = pusername
        WHERE id = padmin_id;
    return 0;
    END IF;
    
END$$

CREATE DEFINER=`root`@`localhost` FUNCTION `modify_user` (`pname` VARCHAR(50), `ppassword_hash` VARCHAR(255), `pusername` VARCHAR(30), `pemail` VARCHAR(50), `padmin_id` INT(11)) RETURNS INT(1)  BEGIN

  DECLARE same_email INT DEFAULT 0;
    DECLARE same_username INT DEFAULT 0;
  SELECT COUNT(*) INTO same_email FROM users WHERE pemail = email AND id != padmin_id;
    SELECT COUNT(*) INTO same_username FROM users WHERE pusername = username AND id != padmin_id;
    
    IF same_email > 0 THEN
      return 1;
    ELSEIF same_username > 0 THEN
      return 2;
    ELSE
      UPDATE users
    SET name = pname,
        email = pemail,
      password_hash = ppassword_hash, 
      username = pusername
        WHERE id = padmin_id;
    return 0;
    END IF;
    
END$$

DELIMITER ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `admin`
--

CREATE TABLE `admin` (
  `id` int(11) NOT NULL,
  `name` varchar(50) NOT NULL,
  `ci` varchar(10) NOT NULL,
  `email` varchar(50) NOT NULL,
  `password_hash` varchar(255) NOT NULL,
  `username` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `admin`
--

INSERT INTO `admin` (`id`, `name`, `ci`, `email`, `password_hash`, `username`) VALUES
(3, 'Juan', 'V31106376', 'juan@gmail.com', '071f1c8f342d65d84e12d1948b6dfa19a0f943bbbb5a9176cabe26ab772d806e5fa003660a18082347a97e4aa4ee940f9b7a9a4ae82ab265dedc3bcc5a2fb8bb', 'juan0407'),
(4, 'Gianella Faria', '30643008', 'gianella@gmail.com', 'ed6c33753d1f9510e1bc5b16f91dd704024c4ca6262b4ded4487765dd760038a6e4e6e741febd9884e52c67bc3ed3df513cfbb119b931a10d1e7d49bbe8ad046', 'giadmin');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `answers`
--

CREATE TABLE `answers` (
  `id` int(11) NOT NULL,
  `timestamp` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp(),
  `body_text` text NOT NULL,
  `report_id` int(11) NOT NULL,
  `admin_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `answers`
--

INSERT INTO `answers` (`id`, `timestamp`, `body_text`, `report_id`, `admin_id`) VALUES
(28, '2024-04-03 19:43:20', 'Buenos dias Luis, nos pondremos en contacto con usted en las proximas 24 horas por medio del numero telefonico provisto para solventar la situacion. Gracias por su paciencia y disculpe los inconvenientes.', 34, 4);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `reports`
--

CREATE TABLE `reports` (
  `id` int(11) NOT NULL,
  `timestamp` timestamp NOT NULL DEFAULT current_timestamp(),
  `type` int(1) NOT NULL,
  `title` varchar(50) NOT NULL,
  `body_text` text NOT NULL,
  `contact_phone` varchar(15) NOT NULL,
  `status_rep` int(1) NOT NULL,
  `user_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `reports`
--

INSERT INTO `reports` (`id`, `timestamp`, `type`, `title`, `body_text`, `contact_phone`, `status_rep`, `user_id`) VALUES
(34, '2024-04-03 19:29:38', 4, 'Uno de mis audifonos llegaron averiados', 'El día de ayer, 2 de abril del 2024 llego un envió de unos audífonos marca Aaron plateados; sin embargo, el audífono derecho no emite sonido. Me gustaría pedir un reembolso de los audífonos.', '04246246432', 1, 11),
(35, '2024-04-03 19:32:40', 2, 'CUANDO VA A LLEGAR MI PAQUETE', 'Hace TRES SEMANAS que hice un pedido de la versión coleccionista del videojuego: Persona 3 Reload, para la PlayStation 5. QUIERO JUGAR MI JUEGO Y NO PUEDO.', '+58 04160708091', 0, 4),
(36, '2024-04-03 19:38:36', 5, 'Confundieron un paquete', 'Acabo de recibir un envío que traía una edición coleccionista del videojuego Persona 3 Reload para la Playstation 5; pero no era para mi, era para un tal Juan Barreto. Quisiera saber que procede hacer para que le den su juego al payaso de Juan que gasto 200 dólares en la edición especial de un juego malo, gracias.', '04246246432', 0, 11);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `users`
--

CREATE TABLE `users` (
  `id` int(11) NOT NULL,
  `name` varchar(50) NOT NULL,
  `ci` varchar(10) NOT NULL,
  `password_hash` varchar(255) NOT NULL,
  `username` varchar(30) NOT NULL,
  `email` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `users`
--

INSERT INTO `users` (`id`, `name`, `ci`, `password_hash`, `username`, `email`) VALUES
(4, 'Juan Barreto', 'V31106376', 'ed6c33753d1f9510e1bc5b16f91dd704024c4ca6262b4ded4487765dd760038a6e4e6e741febd9884e52c67bc3ed3df513cfbb119b931a10d1e7d49bbe8ad046', 'juan0405', 'juanmanuelbarreto@gmail.com'),
(11, 'Luis Garrillo', '30605166', 'ed6c33753d1f9510e1bc5b16f91dd704024c4ca6262b4ded4487765dd760038a6e4e6e741febd9884e52c67bc3ed3df513cfbb119b931a10d1e7d49bbe8ad046', 'lggu', 'garrillofeeling@gmail.com');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `ci` (`ci`),
  ADD UNIQUE KEY `email` (`email`),
  ADD UNIQUE KEY `username` (`username`);

--
-- Indices de la tabla `answers`
--
ALTER TABLE `answers`
  ADD PRIMARY KEY (`id`),
  ADD KEY `report_id` (`report_id`),
  ADD KEY `admin_id` (`admin_id`);

--
-- Indices de la tabla `reports`
--
ALTER TABLE `reports`
  ADD PRIMARY KEY (`id`),
  ADD KEY `user_id` (`user_id`);

--
-- Indices de la tabla `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `username` (`username`),
  ADD UNIQUE KEY `ci` (`ci`),
  ADD UNIQUE KEY `email` (`email`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `admin`
--
ALTER TABLE `admin`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT de la tabla `answers`
--
ALTER TABLE `answers`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=29;

--
-- AUTO_INCREMENT de la tabla `reports`
--
ALTER TABLE `reports`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=37;

--
-- AUTO_INCREMENT de la tabla `users`
--
ALTER TABLE `users`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `answers`
--
ALTER TABLE `answers`
  ADD CONSTRAINT `answers_ibfk_1` FOREIGN KEY (`report_id`) REFERENCES `reports` (`id`),
  ADD CONSTRAINT `answers_ibfk_2` FOREIGN KEY (`admin_id`) REFERENCES `admin` (`id`);

--
-- Filtros para la tabla `reports`
--
ALTER TABLE `reports`
  ADD CONSTRAINT `reports_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `users` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
