package com.mycompany.mavenproject1;
import java.util.Scanner;

/**
 *
 * CALCULADORA IMC
 * @author Joao Gabriel
 * @version 12.02.2025
 * 
 */


class Calc {
    
    public static double imc(double p, double a) {
        
        double poten = a*a;
        double x = p / poten; 
        return x;
        
    }   
}


public class ImcCalcular {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Seu peso: ");
        double weight = input.nextFloat();
        
        System.out.print("Sua altura: ");
        double height = input.nextFloat();
        
        double ImcFinal = Calc.imc(weight, height);
        
        if(ImcFinal >= 40.0) {
            
            System.out.printf("Seu imc e: %.1f\n", ImcFinal);
            System.out.println("Esta com obesidade grave!");
            
        }else if(ImcFinal >= 30.0 && ImcFinal < 40.0) {
            
            System.out.printf("Seu imc e: %.1f\n", ImcFinal);
            System.out.println("Esta com obesidade!");
        
        }else if(ImcFinal >= 25.0 && ImcFinal < 30.0) {
            
            System.out.printf("Seu imc e: %.1f\n", ImcFinal);
            System.out.println("Esta com sobrepeso!");
        
        }else if(ImcFinal >= 18.5 && ImcFinal < 25.0) {
            
            System.out.printf("Seu imc e: %.1f\n", ImcFinal);
            System.out.println("Esta com o peso normal!");
        
        }else {
            
            System.out.printf("Seu imc e: %.1f\n", ImcFinal);
            System.out.println("Esta abaixo do peso!");
        
        }
            
    }
    
}
