package pertemuan3;

import java.util.Scanner;

public class Pertemuan3 {

    static Scanner A = new Scanner(System.in);
    
    public static void main(String[] args) {
        String lampu;
        System.out.print("Masukkan warna lampu : ");
        lampu = A.next();
        switch(lampu){
            case "merah":
                System.out.println("Lampu Merah...Silahkan STOP!");
                break;
            case "kuning":
                System.out.println("Lampu Kuning...Hati-hati dijalan!");
                break;
            case "hijau":
                System.out.println("Lampu Hijau...Silahkan jalan!");
                break;
            default:
                System.out.println("Pilihan warna tidak tersedia!");
        }
    }
    
}
