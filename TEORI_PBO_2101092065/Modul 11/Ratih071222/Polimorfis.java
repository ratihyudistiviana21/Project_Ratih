/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ratih071222;

import Ratih301122.Employee;
import Ratih301122.Person;

/**
 *
 * @author user
 */
public class Polimorfis {
    public static void main(String[] args){
        Person ref;
        Ratih301122.Student student= new Ratih301122.Student();
        Employee employee=new Employee();
        
        ref = student;
        String name = 
        ref.getName();
        System.out.println(name);
        //
        ref = employee;
        String name1 = ref.getName();
        System.out.println(name1);
        
        printInformation(student);
        printInformation(employee);
    }
    
    public static void printInformation(Person p){
        if(p instanceof Ratih301122.Student){
            System.out.println("Nama Student : "+p.getName());
        }
        else if(p instanceof Employee ){
            System.out.println("Nama Employee : "+p.getName());
        }
    }
}
