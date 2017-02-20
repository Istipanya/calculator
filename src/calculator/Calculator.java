/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package calculator;


/**
 *
 * @author IstipanyaGrasya
 */

import java.util.Scanner;
//import javax.swing.JOptionPane;
public class Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int num1;
        int num2;
        String operation;


        Scanner input = new Scanner(System.in);

        System.out.println("Fisr Number: ");
        num1 = input.nextInt();

        System.out.println("Second Number: ");
        num2 = input.nextInt();

        Scanner op = new Scanner(System.in);

       System.out.println("Please enter operation");
        operation = op.next();

        if (operation == "+");
        {
            System.out.println("Additon = " + (num1 + num2));
        }
        
        if  (operation == "-");
        {
            System.out.println("Subtraction = " + (num1 - num2));
        }

        if (operation == "/");
        {
            System.out.println("Division = " + (num1 / num2));
        }
        if (operation == "*")
        {
            System.out.println("Multiplication = " + (num1 * num2));
        }


    }
}
    

