/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ratih051022;

/**
 *
 * @author user
 */
import java.io.*;
public class latihan2 {
    
    public static void main( String[] args ){ 

   int input1 = 0;
   int input2 = 0;
   int hasil;
   BufferedReader data = new BufferedReader(new InputStreamReader(System.in));
        
        try {
            System.out.print("Masukkan angka : ");
            input1 = Integer.parseInt(data.readLine());
            
            System.out.print("Masukkan angka : ");
            input2 = Integer.parseInt(data.readLine());
        } catch (IOException e) {
            System.out.println("Error!");
        }
        //====================================
        hasil = input1 + input2;
        
         System.out.println("Hasil dari, " + input1 + " di tambah " + input2 + " = " + hasil); 
        
        
        
        
        
    }
}
