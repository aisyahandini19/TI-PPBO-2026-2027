import java.util.Scanner;
public class KalkulatorBangunDatar {
    public  static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //input panjang dan lebih persegi panjang
        System.out.print("Masukkan panjang: ");
        double panjang = input.nextDouble();
        System.out.print("Masukkan lebar: ");
        double lebar = input.nextDouble();

        /*menghitung luas persegi panjang */
        double luasPersegiPanjang = panjang * lebar;

        /*menghitung keliling persegi panjang */
        double kelilingPersegiPanjang = 2 * (panjang + lebar);

        /*menentukan apakah luas lebih dari 100*/
        boolean luasBasar = luasPersegiPanjang > 100;

        /*menapilkan hasil persegi panjang */
        System.out.println("Luas persegi panjang = " + luasPersegiPanjang);
        System.out.println("Keliling persegi panjang = " + kelilingPersegiPanjang);
        System.out.println("Luas > 100 = " + luasBasar);

        /*input jari-jari lingkaran*/
        System.out.println("Masukkan jari-jari lingkaran: ");
        double jariJari = input.nextDouble();

        /*menghitung luas lingkaran*/
        double luasLingkaran = Math.PI * jariJari * jariJari;

        /* menghitung keliling lingkarang*/
        double kelilingLingkaran = 2 * Math.PI * jariJari;

        /*menapilkan hasil lingkaran*/
        System.out.println("Luas lingkaran = " + luasLingkaran);
        System.out.println("keliling lingkaean = " + kelilingLingkaran);

        input.close();
    }

}
