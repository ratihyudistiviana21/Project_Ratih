/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ratih301122;

/**
 *
 * @author user
 */
public class Employee extends Person {
    
    @Override
    public String getName(){
        super.name="Dodi";
        System.out.println("Employee : getName");
        return name;
    }

    
}
