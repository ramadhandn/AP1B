package bangundatar;

public class Memanggil {
    public static void main(String[] args) {
        Lingkaran A = new Lingkaran();
        A.r = 15;
        A.luas();
        A.keliling();
        
        PersegiPanjang B = new PersegiPanjang();
        B.lebar = 15;
        B.panjang = 20;
        B.luas();
        B.keliling();
    }
}
