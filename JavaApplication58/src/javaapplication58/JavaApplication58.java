/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication58;
import java.util.Scanner;
/**
 *
 * @author WHITEKABAR
 */
public class JavaApplication58 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double sum = 0; int i = 0;
        boolean doneInputing = false; String input1;
        Scanner input = new Scanner (System.in);
        System.out.println("Please enter each value at a time.");
        System.out.println("Enter 'q' when finished.");
        while (!doneInputing) {
            System.out.print("--Enter value #"+(i+1)+" : ");
            input1 = input.next();
            if ((input1.length()==1) && (input1.charAt(0)=='q')) {
                doneInputing = true;
            }else{
                i++;
                sum += Double.parseDouble(input1);
            }
            }
        System.out.println("Average = "+(sum/i));
        }
    }
    

