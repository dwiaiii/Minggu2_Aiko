/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan1;
import java.util.Scanner;
    
    

class Minggu2_Aiko {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        double celcius, fahrenheit, reamur;
        
        System.out.print("Masukan Nilai Derajat Celcius : ");
        celcius = input.nextDouble();

        fahrenheit = (celcius * 9/5) + 32;
        reamur = celcius * 4/5;

        System.out.println("\nHasil Konversi ");
        System.out.println("Derajat Fahrenheit : " + fahrenheit);
        System.out.println("Derajat Reamur     : " + reamur);
    }
}