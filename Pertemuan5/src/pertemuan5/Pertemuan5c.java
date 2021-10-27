package pertemuan5;

import java.util.Scanner;

public class Pertemuan5c {
    static Scanner G = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("Masukkan jumlah mahasiswa");
        int n = G.nextInt();
        String nama[] = new String[n];
        String status[] = new String[n];
        int nilai[] = new int[n];
        for(int i = 0; i < n; i++){
            System.out.println("Mahasiswa ke-" + (i+1));
            System.out.println("Nama : ");
            nama[i] = G.next();
            System.out.println("Nilai : ");
            nilai[i] = G.nextInt();
            if(nilai[i] <= 50) {
                status[i] = "Tidak lulus";
            }
            else{
                status[i] = "Lulus";
            }
        }
            System.out.println("----Daftar Nilai Mahasiswa----");
            System.out.println("------------------------------");
            System.out.println("No\t Nama\t Nilai\t Status");
            System.out.println("------------------------------");
            for(int i = 0; i < n; i++){
                System.out.println((i+1) + "\t" + nama[i] + "\t" + nilai[i] + "\t" + status[i]);
            }
            
        }
            
    }
