import java.util.Scanner;
public class Latihan4 {
    static int cariNilaiMinimum(int[] data) {
        int min = data[0]; // Anggap elemen indeks pertama sebagai nilai terkecil sementara
        for (int nilai : data) { // Menyusuri seluruh isi array satu per satu
            if (nilai < min) { // Jika ditemukan ada nilai yang lebih kecil dari min
                min = nilai; // Ganti isi variabel min dengan nilai yang lebih kecil tersebut
            }
        }
        return min;
    }

    static int cariNilaiMaksimum(int[] data) {
        int max = data[0];
        for (int nilai : data) {
            if (nilai > max) {
                max = nilai;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Membuat objek scanner baru untuk menangkap input

        System.out.print("Masukkan jumlah data ujian: ");
        int jumlah = input.nextInt(); // Membaca jumlah data array dari ketikan user

        int[] nilaiUjian = new int[jumlah]; // Membuat wadah array dengan kapasitas sesuai masukan user

        // Perulangan untuk mengisi nilai array satu per satu dari keyboard
        for (int i = 0; i < jumlah; i++) {
            System.out.print("Masukkan nilai ujian ke-" + (i + 1) + ": ");
            nilaiUjian[i] = input.nextInt(); // Menyimpan data masukan ke dalam indeks array ke-i
        }

        System.out.println("HASIL MIN/MAX ARRAY");
        System.out.println("Nilai Minimun: " + cariNilaiMinimum(nilaiUjian));
        System.out.println("Nilai Maksimum: " + cariNilaiMaksimum(nilaiUjian));

        input.close();
    }
}
