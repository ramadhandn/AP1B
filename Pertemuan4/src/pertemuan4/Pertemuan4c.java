package pertemuan4;

import java.util.Scanner;
        
public class Pertemuan4c {
    public static void main(String[] args){
        Scanner B = new Scanner(System.in);
        int bil;
        System.out.print("Masukkan Bilangan : ");
        bil = B.nextInt();
        System.out.println(bil + " != " + faktorial(bil));
    }
    
    static int faktorial(int n){
        if(n == 0 || n == 1){
            return 1;
        }
        else {
            return n * faktorial(n - 1);
        }
    }
    
}
