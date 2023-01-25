/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ratih071222;

/**
 *
 * @author user
 */
public class Student {
    
    protected String name; 
    protected String address;
    
    public Student(){ 
        System.out.println("Inside Person:Constructor"); 
        name = ""; 
        address = ""; 
    }
    
    public Student( String name, String address ){ 
        this.name = name; 
        this.address = address; 
    }
    
    public String getName(){
        System.out.println("Parent : getName");
        return name;
    }
    
    public void setName (String name){
        this.name = name;
    }
    
    public String getAddress() {
        return address;
    }
    
    public void setAddress (String address){
        this.address = address;
    }
    
}
