/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan1;
import java.util.Scanner;


public class Latihan2 {
    public static void main (String Args[]){
   Scanner input = new Scanner(System.in);
        
        // Input
        System.out.print("Masukan Nilai Radius : ");
        double r = input.nextDouble();
        
        // Proses
        double luas = Math.PI * r * r;
        double keliling = 2 * Math.PI * r;
        
        // Output
        System.out.println("Hasil Perhitungan");
        System.out.println("Luas Lingkaran     : " + luas);
        System.out.println("Keliling Lingkaran : " + keliling);
        
        input.close();
    }
}