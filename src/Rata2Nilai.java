/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Diva Sabila Ramadhan
 * Nama  : Diva Sabila Ramadhan
 * Kelas : IF1
 * NIM   : 10119039
 * Deskripsi Program : Program ini menampilkan rata-rata nilai Mahasiswa
 */
import java.util.Scanner; // import kelas Scanner
public class Rata2Nilai {

    public static void main(String[] args) {
       Scanner masuk = new Scanner(System.in);
       int i, banyakMhs;
       double jum, x, rata;
       System.out.print("Banyaknya Mahasiswa : ");
       banyakMhs = masuk.nextInt();
       jum = 0;
       i = 1;
       while (i<= banyakMhs){
           System.out.print("Nilai Mahasiswa Ke-"+i+" : ");
           x = masuk.nextFloat();
           jum += x;
           i++;
       }
       rata = jum / banyakMhs;
       System.out.println("Maka, Rata-rata dari nilainya adalah " + rata);
       System.out.println("Developed by : Diva Sabila Ramadhan");
    }
    
}
