/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package problems;
import javax.swing.*;
/**
 *
 * @author glSon8840
 */
public class Problems {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num = 0;
        String myInput;
        boolean noError = true;

        //Problem below
        while (noError == true) {
            myInput = JOptionPane.showInputDialog("Please enter an integer");
        try {
            num = Integer.parseInt(myInput);
            noError = false;
      } catch (NumberFormatException nfe) {
        //found an exception
            System.out.println("You did not enter an Integer");
            System.out.println(nfe);
      }
    }
        System.out.println("num = " + num);
    }
    
}
