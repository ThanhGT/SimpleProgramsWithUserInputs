/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class3exercise;

import java.util.Scanner;

/**
 * Class 3-2 Exercise Problem 2
 * Calculate a person's BMI 
 * Author: Thanh Tran
 * Date: September 17, 2018
 */

public class BMICalculator {
 
    public static void main (String[] args) {
        
    double weight;
    double weightKg;
    double height;
    double heightM;
    double BMI;
    
    Scanner input = new Scanner(System.in);
    System.out.println("Please enter your weight in pounds");
    weight = input.nextDouble();
   
    weightKg = weight * 0.45359237;
    
    System.out.println("The weight in kilograms is:" + weightKg);
    
    System.out.println("Please enter your height in inches");
    height = input.nextDouble();
    
    heightM = height * 0.0254;
    
    System.out.println ("The height in meters is:" + heightM);
    
    BMI = weightKg / (heightM * heightM);
    
    System.out.println ("The BMI is " + BMI);
    
    }
    
}
