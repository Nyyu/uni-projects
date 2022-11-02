/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

import java.awt.Color;
import java.io.File;
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
        if (iconName.equals("x")) {
            File file = new File("assets/Xqc.png");
            iconLogo = new ImageIcon(file.getAbsolutePath());
            label.setBackground(Color.blue);
            label.setOpaque(true);
        } else if (iconName.equals("o")) {
            File file = new File("assets/Circle.png");
            iconLogo = new ImageIcon(file.getAbsolutePath());
            label.setBackground(Color.red);
            label.setOpaque(true);
        } else {
            iconLogo = new ImageIcon("");
            label.setBackground(Color.white);
            label.setOpaque(true);
        }

        // Set label icon
        label.setIcon(iconLogo);
    }

    public static int getRandomField() {
        Random rand = new Random();
        return rand.nextInt(3);
    }

    public static int checkWinner(int field[][]) {

        // LINE x COLUMNS
        // Horizontal
        if (field[0][0] == field[0][1] && field[0][0] == field[0][2] && field[0][1] == field[0][2]) {
            return field[0][0];
        } else if (field[1][0] == field[1][1] && field[1][0] == field[1][2] && field[1][1] == field[1][2]) {
            return field[1][0];
        } else if (field[2][0] == field[2][1] && field[2][0] == field[2][2] && field[2][1] == field[2][2]) {
            return field[2][0];
        }

        // Upright/vertical
        if (field[0][0] == field[1][0] && field[0][0] == field[2][0] && field[2][0] == field[1][0]) {
            return field[0][0];
        } else if (field[0][1] == field[1][1] && field[0][1] == field[2][1] && field[1][1] == field[2][1]) {
            return field[0][1];
        } else if (field[0][2] == field[1][2] && field[0][2] == field[2][2] && field[1][2] == field[2][2]) {
            return field[0][2];
        }


        // Tilted shape
        if (field[0][0] == field[1][1] && field[0][0] == field[2][2] && field[2][2] == field[1][1]) {
            return field[0][0];
        } else if (field[0][2] == field[1][1] && field[0][2] == field[2][0] && field[2][0] == field[1][1]) {
            return field[0][2];
        }

        return -1;
    }
}
/* my mental map ;-;
     0 1 2
   0 - - -
   1 - - -
   2 - - -
*/
