/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119069.latihan22.perhitunganlingkaran;
import java.util.Scanner;
/**
 *
 * @author
 * NAMA     : TRI NOVAREL RAHMADHANI
 * KELAS    : PBOIF2
 * NIM      : 10119069
 * Deskripsi Program    : program ini berisi program perhitungan lingkaran
 */
public class PBOIF210119069Latihan22PerhitunganLingkaran {
    public static double hitungJari(double diameter){
        double jari = diameter/2;
        return jari;
    }
    
    public static double hitungLuas(double diameter){
        double jari = hitungJari(diameter);
        double luas = 3.14 * jari * jari;
        return luas;
    }
    
    public static double hitungKeliling(double diameter){
        double jari = hitungJari(diameter);
        double keliling = 2 * 3.14 * jari;
        return keliling;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        String filterAngka;
        double diameter = 0;
        boolean kondisi = true;
        
        System.out.println("======Perhitungan Lingkaran======");
        do {
            System.out.print("Masukkan nilai diameter lingkaran : ");
            filterAngka = scanner.nextLine();
            if (filterAngka.matches("[0-9]*")){
                diameter = Integer.parseInt(filterAngka);
                kondisi = true;
            }else{
                System.out.println("Nilai Diameter Tidak Sesuai!");
                System.out.println("");
                kondisi = false;
            }
        }while(!kondisi);
        
        System.out.println("=====Hasil Perhitungan Lingkaran=====");
        System.out.println("Jari-Jari Lingkaran = " + hitungJari(diameter));
        System.out.println("Luas Lingkaran = " + hitungLuas(diameter));
        System.out.println("Keliling Lingkaran = " + hitungKeliling(diameter));
        
        System.out.println("-------------------------------------");
        System.out.println("Developed by : Tri Novarel Rahmadhani");
            
        }
}
    
