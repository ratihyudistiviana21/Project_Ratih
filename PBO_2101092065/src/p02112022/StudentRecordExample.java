/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ratih.p02112022;

/**
 *
 * @author user
 */
public class StudentRecordExample {

    public static void main(String[] args) {
        StudentRecord student1 = new StudentRecord();
        student1.setName("Ratih");
        student1.setAddress("padang");
        student1.setAge(20);
        student1.setMathGrade(70);
        student1.setEnglishGrade(90);
        student1.setScienceGrade(100);
        //tampilkan
        System.out.println("Nama \t\t:" + student1.getName());
        System.out.println("Alamat \t\t:" + student1.getAddress());
        System.out.println("Umur \t\t:" + student1.getAge());
        System.out.println("Matematika \t:" + student1.getMathGrade());
        System.out.println("B.Inggris \t:" + student1.getEnglishGrade());
        System.out.println("Pengetahuan \t:" + student1.getScienceGrade());
        System.out.println("Rata-Rata \t:" + student1.getAverage());
        System.out.println("Maximum \t:" + student1.getMaximum());
       
        
        StudentRecord student2= new StudentRecord ();
        student2.setName("Ghea");
        student2.setAddress("Painan");
        student2.setAge(20);
        student2.setMathGrade(100);
        student2.setEnglishGrade(90);
        student2.setScienceGrade(90);
        
        student2.print ("");
        student2.print (student2.getEnglishGrade (), 
                student2.getMathGrade(), student2.getScienceGrade());
    }
}
