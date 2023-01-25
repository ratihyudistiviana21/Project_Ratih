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
public class StudentRecord {
    private String name; 
    private String address; 
    private int age; 
    private double mathGrade; 
    private double englishGrade; 
    private double scienceGrade; 
    private double average;  
    private double max;
    private double min;
    public static int studentCount;
    
    
    public StudentRecord(){
        this("Anggi","batang Toru",30);
    }
    public StudentRecord(String temp){
        studentCount++;
        this.name = temp;
    }
    public StudentRecord(String name, String address, int age){
        studentCount++;
        this.name = name;
        this.address = address;
        this.age = age;
    }
    public StudentRecord(double mGrade, double eGrade, double sGrade){
        mathGrade = mGrade;
        englishGrade = eGrade;
        scienceGrade = sGrade;
    } 
    
    public String getName(){
        return name;
    }
    
    public void setName (String name){
        this.name = name;
    }
    
    public String getAddress(){
        return address;
    }
    
    public void setAddress (String address){
        this.address = address;
    }
    
    public int getAge(){
        return age;
    }
    
    public void setAge (int age){
        this.age = age;
    }
    
    public double getMathGrade(){
        return mathGrade;
    }
    
    public void setMathGrade (double mathGrade){
        this.mathGrade = mathGrade;
    }
    
    public double getEnglishGrade(){
        return englishGrade;
    }
    
    public void setEnglishGrade (double englishGrade){
        this.englishGrade = englishGrade;
    }
    
    public double getScienceGrade(){
        return scienceGrade;
    }
    
    public void setScienceGrade (double scienceGrade){
        this.scienceGrade = scienceGrade;
    }
    
    public double getAverage(){
        average = (mathGrade + englishGrade + scienceGrade) / 3;
        return average;
    }
    
    public static int getStudentCount(){
        return studentCount;
    }
    
    public void print( String temp ){
        System.out.println("Name:" + name);
        System.out.println("Address:" + address);
        System.out.println("Age:" + age);
    }
    public void print(double eGrade, double mGrade, double sGrade){
        ///System.out.println("Name:" + name);
        System.out.println("English Grade:" + eGrade);
        System.out.println("Math Grade:" + mGrade);
        System.out.println("Science Grade:" + sGrade);
    } 
    
     public double getMax(){
        max = 0;
        
        if (mathGrade > max){
            max = mathGrade; 
            
            if(englishGrade > max){
            max = englishGrade;
            
               if(scienceGrade > max){
               max = scienceGrade;
               } 
            }
        }
        return max;  
     }
     
      public double getMin(){
        min = 100;
        
        if (mathGrade < min){
            min = mathGrade; 
            
            if(englishGrade < min){
            min = englishGrade;
            
               if(scienceGrade > min){
               min = scienceGrade;
               } 
            }
        }
        return min;  
     }
    
    
    
    
    
    
    
}