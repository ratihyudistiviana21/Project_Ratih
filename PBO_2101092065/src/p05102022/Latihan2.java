/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ratih.p05102022;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author user
 */
public class Latihan2 {
   public static void main( String[] args ){

 BufferedReader dataIn = new BufferedReader(new
 InputStreamReader( System.in) );
 String angka = "";
 int angka1=0;
 int angka2=0;
 int jumlah=0;
 System.out.println("Masukan Angka ");

 try{
 System.out.print("angka1:");
 angka1 = Integer.parseInt(dataIn.readLine());
 System.out.print("Angka2:");
 angka2 = Integer.parseInt(dataIn.readLine());
 }catch( IOException e ){
 System.out.println("Error!");
 }
 jumlah = angka1 + angka2;
 System.out.println("hasil="+jumlah);
 } 
}
