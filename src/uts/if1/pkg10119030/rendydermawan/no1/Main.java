package uts.if1.pkg10119030.rendydermawan.no1;
import java.util.Scanner;
/*
* Nama                 :Rendy Dermawan
* Kelas                :IF-1
* NIM                  :10119030
* Deskripsi Program    :Soal UTS No 1 bersisi Program Tandanya Kamu
*/
public class Main {
        
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Age usia = new Age(2020);
        
        System.out.print("Masukkan Tahun Lahir Anda : ");
        usia.setYearBirth(input.nextInt());
        
                System.out.println("\n=====Hasil Perhitungan Umur=====");
        System.out.println("Tahun lahir anda : " + usia.getYearBirth());
        System.out.println("Hari ini Tahun : " + usia.getYearNow());
        System.out.println("Umur kamu sampai hari ini adalah " + usia.hitungUmur() + " tahun");
        System.out.println("Tandanya Kamu ".concat(usia.tandanyaKamu(usia.hitungUmur())));
    }
}