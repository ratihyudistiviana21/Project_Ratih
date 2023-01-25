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
import javax.swing.JOptionPane; 
public class latihan5 {
    
    public static void main( String[] args ){
            String word1 = "";
            String word2 = "";
            String word3 ="";
        word1 = JOptionPane.showInputDialog("Masukkan kata 1");
        word2 = JOptionPane.showInputDialog("Masukkan kata 2");
        word3 = JOptionPane.showInputDialog("Masukkan kata 3");

        String msg = word1 +" "+word2 +" "+word3;

        JOptionPane.showMessageDialog(null, msg);
    
    }
}
