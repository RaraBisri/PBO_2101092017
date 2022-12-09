/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rara091222;

/**
 *
 * @author USER
 */
public class Student extends Person { 
   public Student(){
            
        super ("Rara","padang");
        System.out.println("Inside Student:Constructor");
        //beberapa kode di sini
    }
    // beberapa kode di sin
    
    public static void main( String[] args )
    {
        Student student = new Student();
        System.out.println(student.getName());
        System.out.println(student.getAddress());
             
    } 
}
    