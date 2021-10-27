package pertemuan5;

import java.util.Scanner;

public class Pertemuan5d {
    static Scanner H = new Scanner(System.in);
    public static void main(String[] args){
        // diketahui matriks
        // 3 4 6-------0
        // 6 8 0-------1
        // 1 5 8-------2
        // k0 k1 k2
        // matriksA[1][2] = 0
        // ordo(size) 3x3 matriksA.length=3x3
        
        int baris, kolom;
        System.out.println("Masukkan Ordo Matriks");
        System.out.println("---------------------");
        System.out.print("Masukkan baris : ");
        baris = H.nextInt();
        System.out.println("Masukkan kolom : ");
        kolom = H.nextInt();
        
        // deklarasikan variable Array untuk matriks 
        int matriksA[][] = new int[baris][kolom];
        int matriksB[][] = new int[baris][kolom];
        int jumlah[][] = new int[baris][kolom];
        
        // input elemen matriks A
        System.out.println("\n Masukkan Elemen matriks A");
        System.out.println("----------------------------");
        for(int i = 0; i < baris; i++){
            for(int j = 0; j < kolom; i++){
                System.out.print("["+(i+1)+"]["+(j+1)+"]");
                matriksA[i][j] = H.nextInt();
            }
        }
        
        // input elemen matriks B
        System.out.println("\n Masukkan Elemen matriks B");
        System.out.println("----------------------------");
        for(int i = 0; i<baris; i++){
            for(int j = 0; j<kolom; i++){
                System.out.print("["+(i+1)+"]["+(j+1)+"]");
                matriksA[i][j]=H.nextInt();
            }
        }
        
        // penjumlahan matriks A dan B
        for(int i = 0; i < baris; i++){
            for(int j = 0; i < kolom; i++){
                jumlah[i][j]=matriksA[i][j]+matriksB[i][j];
            }
        }
        System.out.println("");
        // tampilkan hasil penjumlahan
        System.out.println("Hasil penjumlahan matriks A dan B");
        System.out.println("---------------------------------");
        for(int i = 0; i < baris; i++){
            for(int j = 0; j < kolom; j++){
                System.out.println(jumlah[i][j] + "\t");
            }
            System.out.println("");
        }
        
    }
}
