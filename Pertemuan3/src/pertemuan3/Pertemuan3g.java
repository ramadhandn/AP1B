package pertemuan3;

import java.util.Scanner;

public class Pertemuan3g {
    static Scanner input = new Scanner(System.in);
    public static void main(String args[]){
       String ulang = "y";
       while(ulang.equalsIgnoreCase("y")){
           System.out.println("");
           System.out.println("--HITUNG LUAS BANGUN--");
           System.out.println("----------------------");
           System.out.println("1. Luas Persegi panjang");
           System.out.println("2. Luas Lingkaran");
           System.out.println("3. Luas Segitiga");
           System.out.println("4. Keluar");
           System.out.println("-----------------------");
           System.out.print("Masukkan Pilihan [1-4] :");
           
           int pilih = input.nextInt();
           System.out.println("");
           
           switch(pilih){
            case 1:
                int p, l, luaspp;
                System.out.println("Masukkan Panjang : ");
                p=input.nextInt();
                System.out.println("Masukkan Lebar : ");
                l=input.nextInt();
                luaspp = p * l;
                System.out.println("Luas Persegi Panjang : " + luaspp);
                break;
            case 2:
                double pi, r, luasling;
                pi = 3.14;
                System.out.print("Masukkan Jari2 (r) : ");
                r = input.nextDouble();
                luasling = pi * r * r;
                System.out.println("Luas Lingkaran : " + luasling);
                break;  
            case 3:
                double a,t,luassegitiga;
                System.out.print("Masukkan a : ");
                a = input.nextDouble();
                System.out.println("Masukkan t : ");
                t = input.nextDouble();
                luassegitiga = (a * t) / 2;
                break;  
            case 4:
                System.exit(4);
                break;
                
            default:
                System.out.println("Masukkan hanya pilihan [1-4]");
           }
           System.out.println("Apakah anda ingin menghitung ulang luas bangun kembali? [y/t] : ");
           ulang = input.next();
       }
    }
    
}
