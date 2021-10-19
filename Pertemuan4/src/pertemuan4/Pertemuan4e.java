package pertemuan4;

import java.util.Scanner;

public class Pertemuan4e {
    //Towers of Hanoi
    static Scanner G = new Scanner(System.in);
    static int move = 1;
    public static void main(String[] args){
        int donat;
        System.out.println("Masukkan jumlah donat : ");
        donat = G.nextInt();
        hanoi(donat, 'A', 'B', 'C');
    }
    
    static void hanoi(int donat, char awal, char bantu, char tujuan){
        if(donat >= 1){ //langkah : (2^n)-1
            hanoi(donat-1, awal, tujuan, bantu);
            move(donat, awal, tujuan);
            hanoi(donat-1, bantu, awal, tujuan);
        }
    }
    
    static void move(int step, char awal, char tujuan){
        System.out.println("Langkah " + move);
        move++;
        System.out.print("Pindahkan Donat" + step);
        System.out.print(" Dari- " + awal);
        System.out.println(" Ke- " + tujuan);
    }
    
}
