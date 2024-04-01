package proyecto.verifications;

import javax.swing.JOptionPane;

public class ContentVerifications {
	
	public static boolean verifyUsername(String username) {
		if (username.length() > 30) {
                    JOptionPane.showMessageDialog(null, "La longitud del nombre de usuario no puede ser mayor de 30 caracteres", "Alerta:", JOptionPane.WARNING_MESSAGE); 
	            return false;
		}
                if (username.length() < 1 ) {
                    JOptionPane.showMessageDialog(null, "El nombre de usuario no puede estar vacío", "Alerta:", JOptionPane.WARNING_MESSAGE); 
	            return false;
                } 
		return true;
	}

	public static boolean verifyPassword(String password) {
		if (password.length() > 50) {
                    JOptionPane.showMessageDialog(null, "La longitud de la contraseña no puede ser mayor de 50 caracteres", "Alerta:", JOptionPane.WARNING_MESSAGE); 
                    return false;
		}
                if (password.length() < 1) {
                    JOptionPane.showMessageDialog(null, "La contraseña no puede estar vacía", "Alerta:", JOptionPane.WARNING_MESSAGE); 
                    return false;
                }
		return true;
	}
	
	public static boolean verifyName(String name) {
		if (name.length() > 50) {
                    JOptionPane.showMessageDialog(null, "La longitud del nombre no puede ser mayor de 50 caracteres", "Alerta:", JOptionPane.WARNING_MESSAGE); 
                    return false;
		}
                if (name.length()< 1) {
                    JOptionPane.showMessageDialog(null, "El nombre no puede estar vacío", "Alerta:", JOptionPane.WARNING_MESSAGE); 
                    return false;                    
                }
		return true;
	}
	
	public static boolean verifyCedula(String cedula) {
		if (cedula.length() > 9) {
                    JOptionPane.showMessageDialog(null, "El número de cédula no puede ser mayor de 9 dígitos", "Alerta:", JOptionPane.WARNING_MESSAGE); 
                    return false;
		}
                if (cedula.length() < 1 ) {
                    JOptionPane.showMessageDialog(null, "El número de cédula no puede estar vacío", "Alerta:", JOptionPane.WARNING_MESSAGE); 
                    return false;
                }
		return true;
	}
	
	public static boolean verifyEmail(String email) {
		if (email.length() > 50) {
                    JOptionPane.showMessageDialog(null, "La longitud del correo electrónico no puede ser mayor de 50 caracteres", "Alerta:", JOptionPane.WARNING_MESSAGE); 
                    return false;
		}
                if (email.length() < 1) {
                    JOptionPane.showMessageDialog(null, "La dirección de correo electrónico no puede estar vacía", "Alerta:", JOptionPane.WARNING_MESSAGE); 
                    return false;
                }
		String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
		if (!email.matches(emailRegex)) {
                    JOptionPane.showMessageDialog(null, "La dirección de correo electrónico ingresada es inválida", "Alerta:", JOptionPane.WARNING_MESSAGE); 
                    return false;
		}
		return true;
	}
	
	public static boolean verifyTelephone(String telephone) {
            
                if(telephone.length() > 15) {
                    JOptionPane.showMessageDialog(null, "El número de teléfono no puede ser mayor de 15 caracteres", "Alerta:", JOptionPane.WARNING_MESSAGE); 
                    return false;   
                }
                if(telephone.length() < 1) {
                    JOptionPane.showMessageDialog(null, "El número de teléfono no puede estar vacío", "Alerta:", JOptionPane.WARNING_MESSAGE); 
                    return false;  
                }
		String telefonoRegex = "^(\\+[0-9]{1,3})? ?-?([0-9]{10,11})$";
		if (!telephone.matches(telefonoRegex)) {
                    JOptionPane.showMessageDialog(null, "\"Ingrese un teléfono válido\n Ejemplo: 04146558914, +58-4146558914, +584146558914\"", "Alerta:", JOptionPane.WARNING_MESSAGE); 
                    return false;                         
		}
		return true;
	}
	
	public static boolean verifyTitle(String title) {
		if (title.length() > 50) {
                    JOptionPane.showMessageDialog(null, "La longitud del título no puede ser mayor de 50 caracteres", "Alerta:", JOptionPane.WARNING_MESSAGE); 
                    return false;      
		}
                if (title.length() < 1){
                    JOptionPane.showMessageDialog(null, "El título no puede estar vacío", "Alerta:", JOptionPane.WARNING_MESSAGE); 
                    return false;    
                }
		return true;
	}
	
	public static boolean verifyBodyAndAnswer(String body) {
		if (body.length() > 500) {
                    JOptionPane.showMessageDialog(null, "La longitud del texto no puede ser mayor de 500 caracteres", "Alerta:", JOptionPane.WARNING_MESSAGE); 
                    return false;      
		}
                if (body.length() < 1) {
                    JOptionPane.showMessageDialog(null, "El texto no puede estar vacío", "Alerta:", JOptionPane.WARNING_MESSAGE); 
                    return false;    
                }
		return true;
	}
	
}
