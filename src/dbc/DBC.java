/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbc;

import java.util.Locale;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author T.Ghoneim
 */
public class DBC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Initial variables
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        String input = JOptionPane.showInputDialog(null, "Enter the decimal number !");
        double n = Double.parseDouble(input);
        int integer = (int) n;
        double nonInteger = n - integer;
        String leftFloatingPoint = "";
        String sl = "";
        String rightFloatingPoint = "";
        double x = integer;
        double y = nonInteger;

        //calculating the binary representaion....
        while (x > 0) {
            x = x / 2;
            if ((x * 10) % 10 == 5) {
                sl += "1";
                x = x - 0.5;
            } else {
                sl += "0";
            }
        }

        //Updating the output String
        for (int i = sl.length() - 1; i >= 0; i--) {
            leftFloatingPoint += sl.charAt(i);
        }

        while (y > 0) {
            y = y * 2;

            if (y >= 1) {
                rightFloatingPoint += "1";
                y = y - 1;
            } else {
                rightFloatingPoint += "0";
            }
            //choose how many digits you want to show after the floating point!
            if (rightFloatingPoint.length() == 15) {
                break;
            }
        }
        JOptionPane.showMessageDialog(null,"Binary: " + leftFloatingPoint + "." + rightFloatingPoint);
    }

}
