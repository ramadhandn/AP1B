package pertemuan3;

import java.util.Scanner;

public class Pertemuan3b {
//    static Scanner A = new Scanner(System.in);
    public static void main(String[] args){
        // perulangan
        // counted loop : for
        // for(inisialisasiVar; kondisi; StepInisialisasi) {
        // statements;
        // }
        
        Scanner A = new Scanner(System.in);
        System.out.println("Masukkan Jumlah Perulangan : ");
        int n = A.nextInt();
        for(int i = 1; i < n; i++){
            System.out.println("Perulangan Ke-" + i);
        }
        
    }
}
