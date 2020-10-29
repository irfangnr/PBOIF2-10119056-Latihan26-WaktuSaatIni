/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119056.latihan26.waktusaatini;
import java.util.*;
/**
 * @author ACER
 * NAMA     : Irfan Ginanjar
 * KELAS    : PBOIF2
 * NIM      : 10119056
 * Deskripsi Program: Program ini berisi program untuk menampilkan waktu saat ini
 */
public class PBOIF210119056Latihan26WaktuSaatIni {

    public static void main(String[] args) {
        int detik, menit, jam, hari, bulan, tahun,tanggal;
        GregorianCalendar date = new GregorianCalendar();
        String namabulan[] = {"Januari", "Februari", "Maret", "April", "Mei", "Juni", "Juli", "Agustus", "September", "Oktober", "November", "Desember"};
        String namahari[]= {"Senin", "Selasa", "Rabu", "Kamis", "Jumat", "Sabtu","Minggu"};
        
        detik = date.get(Calendar.SECOND);
        menit = date.get(Calendar.MINUTE);
        jam =  date.get(Calendar.HOUR_OF_DAY);
        tanggal = date.get(Calendar.DAY_OF_MONTH);
        hari = date.get(Calendar.DAY_OF_WEEK);
        bulan = date.get(Calendar.MONTH);
        tahun = date.get(Calendar.YEAR);
        
        System.out.println("Hari ini adalah hari : "+namahari[hari]+", "+tanggal+" "+namabulan[bulan]+" "+tahun+" "+jam+":"+menit+":"+detik);
    }
    
}
