/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ratih261022;

/**
 *
 * @author user
 */
public class OperasiAritmatik {
    public static void main( String[] args ){
        
        double a = Double.parseDouble (args[2]);
        double b = Double.parseDouble (args[3]);

        double sum,difference,product,quotient;
        sum = a + b;
        difference = a - b;
        product = a * b;
        quotient = a / b;
        System.out.println("sum" + sum);
        System.out.println("difference" + difference);
        System.out.println("product" + product);
        System.out.println("quotient" + quotient);
        
        
        } 

}
