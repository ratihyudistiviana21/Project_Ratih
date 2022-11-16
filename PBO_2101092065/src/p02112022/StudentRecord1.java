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
public class StudentRecord1 {
    public static void main(String[] args) {
        StudentRecord Student3 = new StudentRecord ("Stiv","Padang",20);
        Student3.setAge(20);
        Student3.print ("");
        StudentRecord student4 = new StudentRecord ("stiv");
        System.out.println("Jumlah Siswa:"
        + StudentRecord.getStudentCount());
    }
}
