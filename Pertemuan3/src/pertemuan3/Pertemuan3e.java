package pertemuan3;

import java.util.Scanner;

public class Pertemuan3e {
    public static void main(String[] args){
       Scanner W = new Scanner(System.in);
       System.out.print("Masukkan tinggi segitiga : ");
       int t = W.nextInt();
       for(int i = 0; i <= t; i++){
           for(int j = t; j >= i; j--){
               System.out.print("@");
           }
           System.out.println("");
       }
       
   }
}
