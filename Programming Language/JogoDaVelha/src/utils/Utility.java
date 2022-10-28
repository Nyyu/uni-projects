/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author aluno
 */
public class Utility {
    public static String userIcon = "x";    
    public static String aiIcon = "o";
   
    public static void changeBackground(JLabel label, String iconName) {
        // Instanciate variable
        ImageIcon iconLogo;
        
        // Check type (x | o)
        if(iconName.equals("x")) {
            iconLogo = new ImageIcon("D:\\Ni\\JogoDaVelha\\src\\assets\\Xqc.png");
        } else if(iconName.equals("o")) {    
            iconLogo = new ImageIcon("D:\\Ni\\JogoDaVelha\\src\\assets\\Circle.png");
        } else {
            iconLogo = new ImageIcon("");
        }
        
        // Set label icon
        label.setIcon(iconLogo);
    }
    
    public static int getRandomField() {
        Random rand = new Random();
        return rand.nextInt(0, 2);  
    }
    
    
}