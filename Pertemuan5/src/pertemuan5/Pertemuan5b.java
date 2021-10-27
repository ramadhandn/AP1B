package pertemuan5;

public class Pertemuan5b {
    public static void main(String[] args){
        // Array larik
        // array sebuah variabel yang bisa menyimpan banyak data dalam 1 variable
        // array ditulis dengan :
        // jika elemen array diketahui :
        //      tipeData namaVarArray[]={elemen didalam Array};
        // BU kedua :
        //      tipeData namavarArray[]=new tipeData[size];
        //indeks array dimulai dari 0 berakhiran n-1
        
        String nama[] = {"Afdhan", "Shaqila", "Haikal", "Fikri"};
        int nilai[] = {100, 90, 85, 90};
        
        System.out.println("No\t Nama\t Nilai");
        System.out.println("--------------------------------");
        for (int i = 0; i < nama.length; i++){
            System.out.println((i + 1) + "\t" + nama[i] + "\t" + nilai[i]);
        }
        System.out.println("--------------------------------");
    }
}
