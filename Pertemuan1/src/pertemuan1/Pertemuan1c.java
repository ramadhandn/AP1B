
package pertemuan1;

import java.util.Scanner; // import java.util.*;

public class Pertemuan1c {
    public static void main(String[] args){
        Scanner terserah = new Scanner (System.in);
        double pi, r, luasLing;
        System.out.print("Masukkan pi : ");
        pi = terserah.nextDouble();
        System.out.print("Masukkan Jari-Jari : ");
        r = terserah.nextDouble();
            // System.out.println("");
            luasLing = pi*r*r;
            System.out.println("Luas Lingkaran = " + luasLing);
            // System.out.println("Luas Lingkaran = " + (pi*r*r));
    }
}
