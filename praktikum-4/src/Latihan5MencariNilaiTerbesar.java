import java.util.Scanner;
public class Latihan5MencariNilaiTerbesar {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah elemen: ");
        int jumlah = input.nextInt();

        int[] angka = new int[jumlah];

        // Mengisi array
        for (int i = 0; i < angka.length; i++) {
            System.out.print("Angka ke-" + (i + 1) + ": ");
            angka[i] = input.nextInt();
        }
        int terbesar = angka [0];
        int terbesarKedua = Integer.MIN_VALUE;

        // Mencari terbesar dan terbesar kedua
        for (int i = 1; i < angka.length; i++) {

            if (angka[i] > terbesar) {
                terbesarKedua = terbesar;
                terbesar = angka[i];

            } else if (angka[i] > terbesarKedua && angka[i] != terbesar) {
                terbesarKedua = angka[i];
            }
        }
        System.out.println("\nNilai terbeser = " + terbesar );

        if (terbesarKedua == Integer.MIN_VALUE) {
            System.out.println("Tidak ada nilai terbesar kedua yang berbeda.");
        } else {
            System.out.println("Nilai terbesar kedua = " + terbesarKedua);
        }

    }
}
