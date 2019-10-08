/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bol1_4;

import java.util.Scanner;

/**
 *
 * @author jalonsoriveiro
 */
public class Bol1_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //numero 1
        System.out.print("Dame un numero =");
        Scanner numero1= new Scanner(System.in);
        float num1 = numero1.nextFloat(); 
        //numero2
        System.out.print("Dame un numero =");
        Scanner numero2= new Scanner(System.in);
        float num2 = numero2.nextFloat();  
        //float num3 = num1+num2;
        
        System.out.print("La suma = "+(num1+num2)+",\n resta ="+(num1-num2)+","
                + " \n Producto ="+num1*num2+",\n DIvisión ="+num1/num2+ "");
        
        
        
    }
    
}
