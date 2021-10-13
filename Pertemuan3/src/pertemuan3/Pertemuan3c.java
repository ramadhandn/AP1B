package pertemuan3;

import java.util.Scanner;

public class Pertemuan3c {
    public static void main(String[] args){
        Scanner A = new Scanner(System.in);
        
        System.out.print("Masukkan Jumlah Perulangan : ");
        int n = A.nextInt();
        
        // while
        /*
        int i = 1;
        while(i <= n){
            System.out.println("perulangan Ke-" + i);
            i++;
        }
        */
        
        // do while
        int i = 1;
        do{
            System.out.println("perulangan Ke-" + i);
            i++;
        } 
        while(i <= n);
        
    }
}
