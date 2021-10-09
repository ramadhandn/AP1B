package pertemuan2;

import java.util.Scanner;

public class Pertemuan2c {
    static Scanner P = new Scanner(System.in);
    public static void main(String[] args){
        /* 
            buat program untuk membandingkan 2 buah bilangan
            x > y, x < y, x == y
            3 kondisi 
        */
        
        int x, y;
        System.out.println("Masukkan x : ");
        x = P .nextInt();
        System.out.println("Masukkan y : ");
        y = P.nextInt();
        System.out.println("");
        
        if(x > y){
            System.out.println(x + " Lebih besar dari " + y);
        } else if(x < y){
            System.out.println(x + " Lebih kecil dari " + y);
        } else {
            System.out.println(x + " Sama dengan " + y);
        }
    }
}
