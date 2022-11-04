/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rara_0411;

/**
 *
 * @author USER
 */
public class studentrecordexample {
    public static void main(String[] args){
        StudentRecord student1 = new StudentRecord();
        //
        student1.setName("Rara");
        student1.setAddress("Padang");
        student1.setAge(19);
        student1.setMathGrade(90);
        student1.setEnglishGrade(95);
        student1.setScienceGrade(89);
        //
        System.out.println("Nama        :"+student1.getName());
        System.out.println("Alamat       :"+student1.getAddress());
        System.out.println("Umur        :"+student1.getAge());
        
        System.out.println("Nilai Matematika    :"+student1.getMathGrade());
        System.out.println("Nilai Bahasa Inggris    :"+student1.getEnglishGrade());
        System.out.println("Nilai Pengetahuan Alam  :"+student1.getScienceGrade());
        System.out.println("Nilai Rata Rata     :"+student1.getAverage());
        System.out.println("Nilai Maximum        :"+student1.getMax());
    }
}
