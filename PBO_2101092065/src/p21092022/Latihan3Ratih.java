/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p21092022;

/**
 *
 * @author user
 */
public class Latihan3Ratih {
    public static void main(String[] args) {
        int a = 20;
        int b = 25;
        int z = 10;
        int max;
        System.out.println("number 1 = " + a);
        System.out.println("number 2 = " + b);
        System.out.println("number 3 = " + z);
        
        max= (b>=a)? b : a;
        max= (z>=max)? z : max;
        
        System.out.println("Nilai tertinggi adalah angka = "+max);
    }
}
