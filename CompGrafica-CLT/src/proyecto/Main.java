/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import proyecto.views.Login;
import proyecto.views.*;

/**
 *
 * @author juan
 */
public class Main {
    public static void main(String[] args) {      
        
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReportGeneration().setVisible(true);
            }
        });
    }
}
