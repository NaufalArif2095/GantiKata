package PBO1;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/*
 * @author
 * NAMA    : Naufal Arif Maulana
 * KELAS   : PBO12
 * NIM     : 23176026
 * Deskripsi Program : Program ini berisi program untuk menampilkan 
 * ganti kata
 */

import java.util.Scanner;

public class GantiKata {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("====Program Mengganti Kata====");
        System.out.print("Masukkan Kalimat : ");
        String kalimat = scanner.nextLine();
        
        System.out.print("Ganti Kata : ");
        String kataLama = scanner.next();
        
        System.out.print("Menjadi Kata : ");
        String kataBaru = scanner.next();
        
        String kalimatBaru = kalimat.replace(kataLama, kataBaru);
        
        System.out.println("====Hasil Formatting====");
        System.out.println("Kalimat awal : " + kalimat);
        System.out.println("Kalimat baru : " + kalimatBaru);
        
        scanner.close();
    }
}
