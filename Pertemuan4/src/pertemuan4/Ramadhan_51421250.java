package pertemuan4;

import java.util.Scanner;
import static pertemuan4.Ramadhan_51421250.rekursif;

public class Ramadhan_51421250 {
    static Scanner R = new Scanner(System.in);
    public static void main(String args[]){
        int a,b,m;
        System.out.println("Masukkan nilai A : ");
        a = R.nextInt();
        System.out.println("Masukkan nilai B : ");
        b = R.nextInt();
        
        m = a % b;
        System.out.println("Hasil = " + m);
        
        rekursif(m);
    }
    
    static int rekursif(int m){
        if(m == 0){
            System.out.println("Hasil = " + m);
        }
        else if(m == 1){
            System.out.println("Hasil = " + m);
        }
        else {
            int rekursif = 0;
            return rekursif;
        }
        return 0;
    }
    
}
