-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Mar 30, 2024 at 10:06 PM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `cargomara`
--
CREATE DATABASE IF NOT EXISTS `cargomara` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;
USE `cargomara`;

DELIMITER $$
--
-- Functions
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

CREATE DEFINER=`root`@`localhost` FUNCTION `insert_report` (`ptype` INT(1), `ptitle` VARCHAR(50), `pbody_text` TEXT, `pcontact_phone` VARCHAR(12), `puser_id` INT(11)) RETURNS INT(1)  BEGIN

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
-- Table structure for table `admin`
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
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`id`, `name`, `ci`, `email`, `password_hash`, `username`) VALUES
(2, 'Gianellaadm', '30643008', 'fariamendivil@gmail.com', '555666777', 'AdmG'),
(3, 'Juan BarretoADM', 'V31106376', 'juan2@gmail.com', '071f1c8f342d65d84e12d1948b6dfa19a0f943bbbb5a9176cabe26ab772d806e5fa003660a18082347a97e4aa4ee940f9b7a9a4ae82ab265dedc3bcc5a2fb8bb', 'juan0407');

-- --------------------------------------------------------

--
-- Table structure for table `answers`
--

CREATE TABLE `answers` (
  `id` int(11) NOT NULL,
  `timestamp` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp(),
  `body_text` text NOT NULL,
  `report_id` int(11) NOT NULL,
  `admin_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `answers`
--

INSERT INTO `answers` (`id`, `timestamp`, `body_text`, `report_id`, `admin_id`) VALUES
(5, '2024-03-18 02:32:03', 'HOLA ESTA ES TU RESPUESTA CON ESTATUS', 2, 2),
(6, '2024-03-20 03:57:07', 'ta malo', 6, 2),
(9, '2024-03-30 04:04:34', 'grgtht', 10, 3),
(10, '2024-03-30 04:04:54', 'rgthbtg', 19, 3),
(11, '2024-03-30 04:08:21', 'dfegrr', 14, 3),
(12, '2024-03-30 04:08:25', 'dferg', 12, 3),
(13, '2024-03-30 04:08:29', 'egr', 9, 3),
(14, '2024-03-30 04:16:12', 'frggr', 15, 3),
(15, '2024-03-30 04:54:31', 'fegrg', 13, 3),
(16, '2024-03-30 04:54:40', 'efffr', 21, 3),
(17, '2024-03-30 18:11:47', 'Respuesta de prueba', 22, 3),
(18, '2024-03-30 18:22:47', 'frgr', 23, 3),
(19, '2024-03-30 18:30:00', 'htyrfg', 24, 3),
(20, '2024-03-30 18:32:05', 'dfvbgt', 25, 3),
(21, '2024-03-30 19:40:25', 'fvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv\nv\nv\nv\nv\nv\nv\n\nv\nv\n\nv\nv\n\nv\nv\nv\n\nv\nv\n\nv\nv\nv\n\nv\nv\nv\nv\nv\nv\n\nv\nv\nv\nv\nv\n\nv\nv		\nv\nv\nv\n\nv\nv\n\n', 16, 3);

-- --------------------------------------------------------

--
-- Table structure for table `reports`
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
-- Dumping data for table `reports`
--

INSERT INTO `reports` (`id`, `timestamp`, `type`, `title`, `body_text`, `contact_phone`, `status_rep`, `user_id`) VALUES
(2, '2024-03-18 02:32:03', 1, 'Reporte', 'REPORTE PQ SI', '4246277852', 1, 1),
(3, '2024-03-18 02:47:38', 1, 'Funa', 'Voy a funar toda la empresa', '4246246432', 2, 1),
(4, '2024-03-29 01:16:16', 1, 'JUJU', 'ugrjinegtieun', '04146568915', 2, 3),
(5, '2024-03-29 01:16:06', 2, 'IUNORIN', 'ignietqnibn', '04146568915', 2, 3),
(6, '2024-03-20 03:57:07', 3, 'jaja', 'girnin', '04146552054', 1, 3),
(7, '2024-03-30 02:20:57', 2, 'FHTFN', 'dONDE ESTÁ MI PAQUETE', '04146758947', 2, 3),
(8, '2024-03-30 03:47:15', 5, 'gr', 'th', 'gth', 2, 3),
(9, '2024-03-30 04:08:29', 5, 'grfrgth', 'thhthy', 'gthght', 1, 3),
(10, '2024-03-30 04:04:34', 5, 'grfrgth', 'thhthy', 'gthght', 1, 3),
(11, '2024-03-30 03:39:16', 5, 'grfrgth', 'thhthy', 'gthght', 2, 3),
(12, '2024-03-30 04:08:25', 5, 'grfrgth', 'thhthy', 'gthght', 1, 3),
(13, '2024-03-30 04:54:31', 5, 'grfrgth', 'thhthy\n', 'gthght', 1, 3),
(14, '2024-03-30 04:08:21', 5, 'grfrgth', 'thhthy\n', 'gthght', 1, 3),
(15, '2024-03-30 04:16:12', 5, 'grfrgth', 'thhthy\n', 'gthght', 1, 3),
(16, '2024-03-29 22:42:28', 5, 'grfrgth', 'thhthy\n', 'gthght', 1, 3),
(17, '2024-03-29 22:42:32', 5, 'AaAA', 'thhthy\n', 'gthght', 0, 3),
(18, '2024-03-29 22:42:37', 4, 'BBBB', 'thhthy\n', 'gthght', 0, 3),
(19, '2024-03-30 04:04:54', 1, 'hth', 'efrgr', 'hyyh', 1, 3),
(20, '2024-03-30 02:42:35', 1, 'rnybgf', 'brnsgnt', 'nhhnbg', 0, 3),
(21, '2024-03-30 04:54:40', 2, 'Prueba', 'Hehe', '04146758375', 1, 3),
(22, '2024-03-30 18:11:47', 5, 'Titulo de prueba', 'cuerpo de prueba', '04146568915', 1, 7),
(23, '2024-03-30 18:22:47', 2, 'arroz', 'frgrr', '04146568914', 1, 7),
(24, '2024-03-30 18:29:36', 4, 'prueba2', '2342tgb', '21432545', 1, 7),
(25, '2024-03-30 18:31:21', 4, 'ergetwbr', 'defwagretwh', 'efwrgetreyn', 1, 7),
(26, '2024-03-30 18:31:28', 6, 'ntyryh', 'wtyn', 'nytyenr', 0, 7),
(27, '2024-03-30 18:31:35', 4, 'wdaefrgtdn', 'wdeafsddbgfnhg', 'defrdbtgfnh', 0, 7);

-- --------------------------------------------------------

--
-- Table structure for table `users`
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
-- Dumping data for table `users`
--

INSERT INTO `users` (`id`, `name`, `ci`, `password_hash`, `username`, `email`) VALUES
(1, 'Luis', '30605166', '19190608', 'Mel', 'garrillofeeling@gmail.com'),
(2, 'Gianella', '30643008', '1234567g', 'TheService', 'fariamendivil@gmail.com'),
(3, 'juanmbarreto', '31106376', '071f1c8f342d65d84e12d1948b6dfa19a0f943bbbb5a9176cabe26ab772d806e5fa003660a18082347a97e4aa4ee940f9b7a9a4ae82ab265dedc3bcc5a2fb8bb', 'juan0408', 'juan2.manuelbarreto@gmail.com'),
(4, 'Juan Barreto', 'V31106376', 'ed6c33753d1f9510e1bc5b16f91dd704024c4ca6262b4ded4487765dd760038a6e4e6e741febd9884e52c67bc3ed3df513cfbb119b931a10d1e7d49bbe8ad046', 'juan0405', 'juanmanuelbarreto@gmail.com'),
(5, '', 'V', '1498e85600493c77f84167289050ce86ab10d0694552ebc9d737b5dee8b30f77598ad81d51254c72ab1147e791d7f92e4d7c68a224f8051421a079bceeb7d271', '', ''),
(6, 'luis', 'E12121212', 'eabe3446c44495c9d8a108158e735eb8c0eefe7003f0beef02936065e0b900a9d7222b7266b5c49a6ad471287b42eb095ebbfd4110d5291b839c49b5be2c0c6b', 'luribe28', 'luribe28@googlemail.com'),
(7, 'Prueba2', 'V555555', 'a6f1dec5f135dca35478dd3088277897bc3272b09475c205c76ae4c4f793b9c9fc27edc5ebcf4b45e076bef87f434c4f870e6dc93245a87caf7e3428ca354fec', 'prueba2', 'prueba@mail.com');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `ci` (`ci`),
  ADD UNIQUE KEY `email` (`email`),
  ADD UNIQUE KEY `username` (`username`);

--
-- Indexes for table `answers`
--
ALTER TABLE `answers`
  ADD PRIMARY KEY (`id`),
  ADD KEY `report_id` (`report_id`),
  ADD KEY `admin_id` (`admin_id`);

--
-- Indexes for table `reports`
--
ALTER TABLE `reports`
  ADD PRIMARY KEY (`id`),
  ADD KEY `user_id` (`user_id`);

--
-- Indexes for table `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `username` (`username`),
  ADD UNIQUE KEY `ci` (`ci`),
  ADD UNIQUE KEY `email` (`email`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `admin`
--
ALTER TABLE `admin`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `answers`
--
ALTER TABLE `answers`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=22;

--
-- AUTO_INCREMENT for table `reports`
--
ALTER TABLE `reports`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=28;

--
-- AUTO_INCREMENT for table `users`
--
ALTER TABLE `users`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `answers`
--
ALTER TABLE `answers`
  ADD CONSTRAINT `answers_ibfk_1` FOREIGN KEY (`report_id`) REFERENCES `reports` (`id`),
  ADD CONSTRAINT `answers_ibfk_2` FOREIGN KEY (`admin_id`) REFERENCES `admin` (`id`);

--
-- Constraints for table `reports`
--
ALTER TABLE `reports`
  ADD CONSTRAINT `reports_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `users` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
