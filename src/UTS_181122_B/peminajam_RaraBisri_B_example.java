/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UTS_181122_B;

/**
 *
 * @author USER
 */
public class peminajam_RaraBisri_B_example {
     public static void main( String[] args ){
         
        peminjaman_RaraBisri nasabah1 = new peminjaman_RaraBisri ();
        nasabah1.setKodePeminjaman("1023A");
        nasabah1.setTanggal("18 November 2022");
        nasabah1.setKodeNasabah("B01");
        nasabah1.setNamaNasabah("Aini");
        nasabah1.setJumlahPinjaman(300000);
        nasabah1.setLamaPinjaman(12);
        
        System.out.println("Kode Peminjam       : " +nasabah1.getKodePeminjaman());
        System.out.println("Tanggal             : " +nasabah1.getTanggal());
        System.out.println("Kode Nasabah        : " +nasabah1.getKodeNasabah());
        System.out.println("Nama Nasabah        : " +nasabah1.getNamaNasabah ());
        System.out.println("Jumlah Pinjaman     : " +nasabah1.getJumlahPinjaman());
        System.out.println("Lama Pinjaman       : " +nasabah1.getLamaPinjaman());
        System.out.println("Bunga               : " +nasabah1.getBunga());
        System.out.println("Angsuran Pokok      : " +nasabah1.getAngsuranPokok());
        System.out.println("Angsuran Perbulan   : " +nasabah1.getAngsuranPerbulan());
        System.out.println("Total Hutang        : " +nasabah1.getTotalHutang());
    }
}
         
         
         
         
   

