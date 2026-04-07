/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan1;
import java.util.Scanner;

public class Latihan8 {
  public static void main (String Args[]){
      Scanner input = new Scanner(System.in);
        
        // Input
        System.out.print("Masukan Nama Siswa       : ");
        String nama = input.nextLine();
        
        System.out.print("Nilai UTS               : ");
        double uts = input.nextDouble();
        
        System.out.print("Nilai UAS               : ");
        double uas = input.nextDouble();
        
        System.out.print("Nilai Tugas Mandiri     : ");
        double tugas = input.nextDouble();
        
        // Proses
        double nilaiUTS = uts * 0.35;
        double nilaiUAS = uas * 0.45;
        double nilaiTugas = tugas * 0.20;
        
        double nilaiAkhir = nilaiUTS + nilaiUAS + nilaiTugas;
        
        // Output
        System.out.println("\nHasil Perhitungan");
        System.out.println("Nama Siswa             : " + nama);
        System.out.println("Nilai Murni UTS        : " + nilaiUTS);
        System.out.println("Nilai Murni UAS        : " + nilaiUAS);
        System.out.println("Nilai Murni Tugas      : " + nilaiTugas);
        System.out.println("Nilai Akhir            : " + nilaiAkhir);
        
        input.close();
    }

  }  
