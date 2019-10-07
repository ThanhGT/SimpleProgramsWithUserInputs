/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class3exercise;

import java.util.Scanner;

/**
 * Class 3-1 Exercise Problem 1
 * Convert time into hours, minutes and seconds
 * Author: Thanh Tran
 * Date: September 17, 2018
 */

public class TimeConversionCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // define the variables seconds, hours, minutes and time
        long sec;
        long hours;
        long minutes;
        long t;
        
        //ask the user for the time
        Scanner input = new Scanner(System.in);
        System.out.println ("Please enter a value for time in seconds to calculate to hours, minutes and seconds");
        sec = input.nextLong();
        
        // computer hours, minutes and seconds
        t = sec;
        hours = sec/3600;
        sec = sec % 3600;
        minutes = sec/60;
        sec = t % 60;
        
        // display the output to the user
        System.out.println (t + " is " + hours + " hour(s)" + minutes + " minute(s) and " + sec + " second(s)");
        System.out.println ("Thank you for using the program");
        
    }
}
