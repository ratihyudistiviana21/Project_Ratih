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
public abstract class Shape {
    
    public void breath(){
        System.out.println("Living Thing breathing..."); 
    }
    
    public void eat(){
        System.out.println("Living Thing eating...");
    }
    
    public abstract void walk();
    
}
