/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ratih021122;

/**
 *
 * @author user
 */
public class StudentRecord1 {
    public static void main( String[] args ){
    
        ///inisialisasi awal
        StudentRecord student3 = new StudentRecord("Denis","Khatib",19);
        student3.print("");
        System.out.println("Tertinggi  :"+student3.getMax());
        System.out.println("Terendah  :"+student3.getMin());
        System.out.println("======================================");
        
        StudentRecord student4 = new StudentRecord();
        student4.print("");
        
        System.out.println("Jumlah siswa"+StudentRecord.getStudentCount());
    
    
    
    }
    
}
