
package pe.egcc.eurekaapp.util;

import java.awt.Component;
import javax.swing.JOptionPane;

public class Mensajes {

    private Mensajes() {
    }
    
    public static void showInfo(Component parent, String message){
        JOptionPane.showMessageDialog(parent, message,"INFO",JOptionPane.INFORMATION_MESSAGE);
    }
    
    public static void showError(Component parent, String message){
        JOptionPane.showMessageDialog(parent, message,"ERROR",JOptionPane.INFORMATION_MESSAGE);
    }
    
    
}
