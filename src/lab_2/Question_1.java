/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab_2;

import java.util.Scanner;

/**
 *
 * @author tasni
 */
public class Question_1{
    public static void main(String[] args){
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Input the Temperature in Fahrenheit : ");
    double Fahrenheit = keyboard.nextDouble();
        
    double Celsious = (Fahrenheit-32)*1.8;
    System.out.printf("The Temperature in Celsious is = %.2f", Celsious);
    keyboard.close();
        
    
}
}