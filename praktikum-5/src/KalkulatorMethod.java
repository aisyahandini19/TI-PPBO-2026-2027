import java.util.Scanner;
public class KalkulatorMethod {
    static double tambah(double a, double b){
        return a + b;
    }
    static double tambah(double a, double b, double c) {
        return a + b + c;
    }
    static double kurang(double a, double b){
        return a - b;
    }
    static double kali(double a, double b){
        return a * b;
    }
    static double bagi(double a, double b){
        if ( a == 0){
            System.out.println("Error: pembagian dengan nol tidak diperbolehkan ");
            return 0;
        }
        return a/ b;
    }
    static double pangkat(double a, double b){
        return Math.pow(a, b);
    }
    static double akarKuatdrat(double a){
        if (a < 0){
            System.out.println("Error: tidak dapat meng hitung akar dari angkat negatif!" );
            return 0;
        }
        return Math.sqrt(a);
    }
    static double riwayatKeMaksimum(double[] riwayatHasil, int totalData){
        if (totalData == 0) return 0;

        double max = riwayatHasil[0];
        for (int i = 0; i < totalData; i++){
            if (riwayatHasil[i] > max){
                max = riwayatHasil[i];
            }
        }
        return max;
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        double[] riwayat = new double[100];
        int jumlahHitungan = 0;
        while (true){
            System.out.println("PROGRAM KALKULATOR METHOD");
            System.out.println("1. penjumlan(2 angka) ");
            System.out.println("2. penjumlan(3 angka) ");
            System.out.println("3. pengurangan ");
            System.out.println("4. perkalian ");
            System.out.println("5. pembagian ");
            System.out.println("6. perpangkatan");
            System.out.println("7. akar kuadrat ");
            System.out.println("8. keluar ");
            System.out.println("pilih menu operasi ");
            int pilihan = input.nextInt();

            if (pilihan == 8){
                System.out.println("terimakasih telah menggunakan kalkulator.");
                double nilaiTerbesar = riwayatKeMaksimum(riwayat, jumlahHitungan);
                System.out.println("nilai hasil terbesar dari riwayat hitungan anda: " + nilaiTerbesar);
                break;
            }
            double angka1, angka2, angka3, hasil = 0; // Siapkan variabel penampung angka input dan hasil

            switch (pilihan) { // Percabangan switch-case untuk mengeksekusi fungsi sesuai pilihan menu
                case 1:
                    System.out.print("Masukkan angka pertama: "); angka1 = input.nextDouble();
                    System.out.print("Masukkan angka kedua: ");   angka2 = input.nextDouble();
                    hasil = tambah(angka1, angka2); // Memanggil method tambah 2 parameter
                    System.out.println("Hasil: " + hasil);
                    break;
                case 2:
                    System.out.print("Masukkan angka pertama: "); angka1 = input.nextDouble();
                    System.out.print("Masukkan angka kedua: ");   angka2 = input.nextDouble();
                    System.out.print("Masukkan angka ketiga: ");  angka3 = input.nextDouble();
                    hasil = tambah(angka1, angka2, angka3); // Memanggil method tambah 3 parameter (Overloading)
                    System.out.println("Hasil: " + hasil);
                    break;
                case 3:
                    System.out.print("Masukkan angka pertama: "); angka1 = input.nextDouble();
                    System.out.print("Masukkan angka kedua: ");   angka2 = input.nextDouble();
                    hasil = kurang(angka1, angka2); // Memanggil method kurang
                    System.out.println("Hasil: " + hasil);
                    break;
                case 4:
                    System.out.print("Masukkan angka pertama: "); angka1 = input.nextDouble();
                    System.out.print("Masukkan angka kedua: ");   angka2 = input.nextDouble();
                    hasil = kali(angka1, angka2); // Memanggil method kali
                    System.out.println("Hasil: " + hasil);
                    break;
                case 5:
                    System.out.print("Masukkan angka pembilang: "); angka1 = input.nextDouble();
                    System.out.print("Masukkan angka penyebut: ");  angka2 = input.nextDouble();
                    hasil = bagi(angka1, angka2); // Memanggil method bagi
                    System.out.println("Hasil: " + hasil);
                    break;
                case 6:
                    System.out.print("Masukkan angka basis: ");    angka1 = input.nextDouble();
                    System.out.print("Masukkan angka pangkat: ");  angka2 = input.nextDouble();
                    hasil = pangkat(angka1, angka2); // Memanggil method pangkat
                    System.out.println("Hasil: " + hasil);
                    break;
                case 7:
                    System.out.print("Masukkan angka yang diakarkan: "); angka1 = input.nextDouble();
                    hasil = akarKuatdrat(angka1); // Memanggil method akar kuadrat
                    System.out.println("Hasil: " + hasil);
                    break;
                default:
                    System.out.println("Pilihan tidak valid! Silakan pilih angka 1 sampai 8.");
                    continue; // Jika input ngawur, lompat ke perulangan menu berikutnya tanpa menyimpan riwayat
            }
            riwayat[jumlahHitungan] = hasil;
            jumlahHitungan++;
        }
        input.close();
    }
}
