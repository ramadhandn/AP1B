package pertemuan3;

import java.util.Scanner;

public class Pertemuan3d {
    public static void main(String[] args){
       Scanner W = new Scanner(System.in);
       System.out.print("Masukkan tinggi segitiga : ");
       int t = W.nextInt();
        
        // Segitiga Increment
       for(int i = 0; i < t; i++){
           for(int j = 0; j < i; j++){
               System.out.print("@");
           }
           System.out.println("");
       }
       
        /* Segitiga Decrement
       for(int i = t; i > 0; i--){
           for(int j = 0; j < i; j++){
               System.out.print("*");
           }
           System.out.println("");
       }
       */
       
   } 
}
