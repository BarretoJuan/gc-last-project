package proyecto;

import javax.swing.InputVerifier;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;



public class Verify {


    //verificador de nombre (no más de 50 caracteres sin números (sí debe permitir caracteres especiales))
    public static class NameVerifier extends InputVerifier{

        @Override 
        public boolean verify(JComponent input) {

            JTextField textField = (JTextField) input; //JTextField to evaluate

            if (textField.getText().length() <= 50) { //if length is lower than max length

                if (textField.getText().length() == 0) { //if textfield length is zero
                    JOptionPane.showMessageDialog(null, "El campo seleccionado no debe estar vacío", "Alerta: Dato Incorrecto", JOptionPane.WARNING_MESSAGE);
                    textField.setText("");
                    return false;
                }

                else { 

                    boolean containsDigit = false;

                    for (char c : textField.getText().toCharArray()) { //verifies if the String contains a digit or not
                        if (Character.isDigit(c)) {
                            containsDigit = true;
                        }
                    }

                    if (containsDigit) { //if it contains a digit, return false
                        JOptionPane.showMessageDialog(null, "El nombre no puede contener dígitos", "Alerta: Dato Incorrecto", JOptionPane.WARNING_MESSAGE);
                        return false;
                    }
                    
                    else{ //else, return true
                        return true;
                    }
                }
            }
            
            else {
                JOptionPane.showMessageDialog(null, "El campo no debe tener más de "+50+ " caracteres", "Alerta: Dato Incorrecto", JOptionPane.WARNING_MESSAGE);
                textField.setText("");
                return false;
            }
        }
    }

    //Verificador de cedula
    public static class CedulaVerifier extends InputVerifier {

        @Override
        public boolean verify(JComponent input) {

            JTextField textField = (JTextField) input;

            try {
                int number = Integer.parseInt(textField.getText());    
                if (number > 0 && number <= 999999999) {
                    return true;
                }       
                else {
                    JOptionPane.showMessageDialog(null, "La cédula debe ser un entero positivo de máximo 9 dígitos", "Alerta: Dato Incorrecto", JOptionPane.WARNING_MESSAGE);
                    textField.setText("");
                    return false;
                }    
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "La cédula debe ser un entero positivo de máximo 9 dígitos", "Alerta: Dato Incorrecto", JOptionPane.WARNING_MESSAGE);
                textField.setText("");
                return false;
                
                }
            }
        }


    public static class usernameVerifier extends inputVerifier{

        @Override 
        public boolean verify(JComponent input) {

            JTextField textField = (JTextField) input;

            if(textfield.getText().getLength() <= 30) {
                return true;
            }
            else {
                JOptionPane.showMessageDialog(null, "El nombre de usuario no debe tener más de 30 caracteres", "Alerta: Dato Incorrecto", JOptionPane.WARNING_MESSAGE);
                return false;
            }
        }
    }

    public static class usernameVerifier extends inputVerifier{

        @Override 
        public boolean verify(JComponent input) {

            JTextField textField = (JTextField) input;

            if(textfield.getText().getLength() <= 30) {
                return true;
            }
            else {
                JOptionPane.showMessageDialog(null, "El nombre de usuario no debe tener más de 30 caracteres", "Alerta: Dato Incorrecto", JOptionPane.WARNING_MESSAGE);
                return false;
            }
        }
    }


    //Verificador de cedula
    public static class CodigoVerifier extends InputVerifier {
        @Override
        public boolean verify(JComponent input) {
            JTextField textField = (JTextField) input;
            try {
                int number = Integer.parseInt(textField.getText());    
                if (number > 0 && number <= 9999) {
                    return true;
                }       
                else {
                    JOptionPane.showMessageDialog(null, "El código debe ser un entero positivo de máximo 4 dígitos", "Alerta: Dato Incorrecto", JOptionPane.WARNING_MESSAGE);
                    textField.setText("");
                    return false;
                }    
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "El código debe ser un entero positivo de máximo 4 dígitos", "Alerta: Dato Incorrecto", JOptionPane.WARNING_MESSAGE);
                textField.setText("");
                return false;
                
                }
            }
        }


   
    //Verificador de caracteres, recibe como parámetro la longitud maxima
    public static class MaxLengthVerifier extends InputVerifier {
        private int maxLength;

        public MaxLengthVerifier(int maxLength) {
            this.maxLength = maxLength;
        }

        @Override
        public boolean verify(JComponent input) {
            JTextField textField = (JTextField) input;

            if (textField.getText().length()<= maxLength) {
                if (textField.getText().length() == 0) {
                    JOptionPane.showMessageDialog(null, "El campo seleccionado no debe estar vacío", "Alerta: Dato Incorrecto", JOptionPane.WARNING_MESSAGE);
                    textField.setText("");
                    return false;

                }
                else {
                    return true;
                }
               
            }
            

            else {
                JOptionPane.showMessageDialog(null, "El campo no debe tener más de "+maxLength+ " caracteres", "Alerta: Dato Incorrecto", JOptionPane.WARNING_MESSAGE);
                textField.setText("");
                return false;
            }
        }
    }


   //Verificador de caracteres, recibe como parámetro la longitud maxima
   public static class MaxLengthAreaVerifier extends InputVerifier {
    private int maxLength;

    public MaxLengthAreaVerifier(int maxLength) {
        this.maxLength = maxLength;
    }

    @Override
    public boolean verify(JComponent input) {
        JTextArea textArea = (JTextArea) input;

        if (textArea.getText().length()<= maxLength) {
            return true;
        }
        

        else {
            JOptionPane.showMessageDialog(null, "El campo no debe tener más de "+maxLength+ " caracteres", "Alerta: Dato Incorrecto", JOptionPane.WARNING_MESSAGE);
            textArea.setText("");
            return false;
        }
    }
}


    // Verificador de correo electrónico
    public static class EmailVerifier extends InputVerifier {
        @Override
        public boolean verify(JComponent input) {
            JTextField textField = (JTextField) input;
            String email = textField.getText().trim();

            // RegeX GOES YEEHAAAW
            String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";

            if (email.matches(emailRegex)) {
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Ingrese una dirección de correo electrónico válida", "Alerta: Dato Incorrecto", JOptionPane.WARNING_MESSAGE);
                textField.setText("");
                return false;
            }
        }
    }



   // Verificador de telefono
   public static class TelefonoVerifier extends InputVerifier {
    @Override
    public boolean verify(JComponent input) {
        JTextField textField = (JTextField) input;
        String telefono = textField.getText().trim();

        // RegeX GOES YEEHAAAW
        String telefonoRegex = "^(\\+[0-9]{1,3})?([0-9]{10,11})$";

        if (telefono.matches(telefonoRegex)) {
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Ingrese un teléfono válido", "Alerta: Dato Incorrecto", JOptionPane.WARNING_MESSAGE);
            textField.setText("");
            return false;
        }
    }
}




}



