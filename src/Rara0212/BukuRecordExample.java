/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rara0212;

/**
 *
 * @author USER
 */
public class BukuRecordExample {
     public static void main(String[] args){
         
        BukuRecord buku1 = new BukuRecord("Rara" , "Padang" , "08989179931" , "rarabisri@gmail.com" );
        System.out.println("Nama                    :"+buku1.getName());
        System.out.println("Alamat                  :"+buku1.getAddress());
        System.out.println("No.Telpon               :"+buku1.getNotelp());
        System.out.println("Alamat Email            :"+buku1.getEmail());
     }
    
   
} 

