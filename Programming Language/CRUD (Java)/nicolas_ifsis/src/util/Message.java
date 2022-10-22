package util;

import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Message {
    
    public static void showMessage (String text) {
        JOptionPane.showMessageDialog(null, text);
    }
    
    public static boolean verifyMessage(String text) {
        if (text.trim().equals("")) {
            return true;
        }
        return false;
    }
    
    public static boolean verifyMessage(JTextField comp) {
        String text = comp.getText();
        if (text.trim().equals("")) {
            return true;
        }
        return false;
    }
    
    public static boolean verifyMessage(JPasswordField comp) {
        String text = comp.getText();
        if (text.trim().equals("")) {
            return true;
        }
        return false;
    }
    
}
