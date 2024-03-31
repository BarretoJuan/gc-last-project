
package proyecto.verifications;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JFormattedTextField;
import javax.swing.JTextField;


public class KeyVerifications {
    
    public void verifyUsermane(JFormattedTextField usernameField){
    
        usernameField.addKeyListener(new KeyAdapter() { 
            
            @Override
            public void keyTyped(KeyEvent e) {
                char k = e.getKeyChar();
                if (String.valueOf(k).matches("\\s")) {
                    e.consume();
                }
            }    
        });
    }
    
    public void verifyName(JFormattedTextField nameField){
    
        nameField.addKeyListener(new KeyAdapter() { 
            
            @Override
            public void keyTyped(KeyEvent e) {
                char k = e.getKeyChar();
                if (String.valueOf(k).matches("[0-9!¡@#%&\\^\\(\\)\\+=\\{\\}\\[\\];:¿\\?/\\<>$_]+")) {
                    e.consume();
                }
            }    
        }); 
    }

    public void verifyCedula(JFormattedTextField cedulaField){
    
        cedulaField.addKeyListener(new KeyAdapter() { 
            
            @Override
            public void keyTyped(KeyEvent e) {
                char k = e.getKeyChar();
                if (!String.valueOf(k).matches("[0-9]+")) {
                    e.consume();
                }
            }    
        }); 
    }
    
    public void verifyEmail(JFormattedTextField emailField){
    
       emailField.addKeyListener(new KeyAdapter() { 
            
           @Override
           public void keyTyped(KeyEvent e) {
               char k = e.getKeyChar();
               if (!String.valueOf(k).matches("[0-9a-zA-Z@._]+")) {
                    e.consume();
               }
           }    
       }); 
    }
    
    public void verifyTelefono(JTextField telefonoField){
    
       telefonoField.addKeyListener(new KeyAdapter() { 
            
           @Override
           public void keyTyped(KeyEvent e) {
               char k = e.getKeyChar();
               if (!String.valueOf(k).matches("[0-9+- ]+")) {
                    e.consume();
               }
           }    
       }); 
    }
   
    
    
}