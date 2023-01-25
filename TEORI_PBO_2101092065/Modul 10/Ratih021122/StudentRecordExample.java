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
public class StudentRecordExample {
    
    public static void main( String[] args ){
        
        StudentRecord student1 = new StudentRecord();
        
        student1.setName("Ratih");
        student1.setAddress("Khatib");
        student1.setAge(18);
        student1.setMathGrade(90);
        student1.setEnglishGrade(95);
        student1.setScienceGrade(99);
        
        System.out.println("Nama        :"+student1.getName());
        System.out.println("Alamat      :"+student1.getAddress());
        System.out.println("Umur        :"+student1.getAge());
        System.out.println("Mtk         :"+student1.getMathGrade());
        System.out.println("B.inggris   :"+student1.getEnglishGrade());
        System.out.println("PEngetahuan :"+student1.getScienceGrade());
        System.out.println("Rata- Rata  :"+student1.getAverage());
        System.out.println("Tertinggi   :"+student1.getMax());
        System.out.println("Terendah    :"+student1.getMin());
        
        System.out.println("======================================");
        
        StudentRecord student2 = new StudentRecord();
        student2.setName("Anggi");
        student2.setAddress("Batang Toru");
        student2.setAge(19);
        student2.setMathGrade(60);
        student2.setEnglishGrade(70);
        student2.setScienceGrade(50);
        
        student2.print("");
        student2.print(student2.getMathGrade(), student2.getEnglishGrade(), student1.getScienceGrade());
    }
    
}
