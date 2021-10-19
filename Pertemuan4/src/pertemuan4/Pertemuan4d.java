package pertemuan4;

import java.util.Scanner;

public class Pertemuan4d {
    static Scanner A = new Scanner(System.in);
    public static void main(String args[]){
        // deret Fibonacci
        // 0 1 2 3 5 8...
        // jika S1=0 S2=1 maka S3=S1+S2..dst
        
        int n;
        System.out.print("Masukkan jumlah deret Fibonacci : ");
        n = A.nextInt();
        System.out.println(n + " Deret Fibonacci");
        for(int i = 0; i <= n; i++){
            System.out.println(fibo(i) + " ");
        }
    }
    
    static int fibo(int n){
        if(n == 0){
            return 1;
        }
        else if(n == 1){
            return 1;
        }
        else {
            return fibo(n - 1) + fibo(n - 2);
        }
    }
}
