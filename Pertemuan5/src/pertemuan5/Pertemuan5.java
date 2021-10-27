package pertemuan5;

import java.util.Scanner;

public class Pertemuan5 {

    static Scanner X = new Scanner(System.in);
    public static void main(String[] args) {
        // TODO code application logic here
        int a, b;
        System.out.print("Masukkan a : ");
        a = X.nextInt();
        System.out.print("Masukkan b : ");
        b = X.nextInt();
        System.out.println("(" + a + "," + b + ")=" + hitungM(a,b));
        if(hitungM(a,b) == 1){
            System.out.println(b + " dapat digunakan sebagai kunci publik");
        }
        else{
            System.out.println(b + " tidak dapat digunakan sebagai kunci publik");
        }
    }
    
    static int hitungM(int a, int b){
        if(b == 0){
            return a;
        }
        else{
            return hitungM(b, a%b);
        }
    }
    /*
        M(23.7)=1 --> 23 = 3 > 7+2
        7=3.2+1
        3=3.1+0
    
        M(25)
    */
    
}
