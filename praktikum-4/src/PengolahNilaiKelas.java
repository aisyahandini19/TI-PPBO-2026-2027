import java.util.Scanner;

public class PengolahNilaiKelas {

    public static void main(String[] args) {
        // Membuat objek Scanner untuk membaca input dari pengguna
        Scanner input = new Scanner(System.in);
        // TAHAPAN A: Membaca jumlah mahasiswa dan nilai ujian ke dalam array
        System.out.print("Masukkan jumlah mahasiswa (N): ");
        int n = input.nextInt();

        // Inisialisasi array berukuran N untuk menyimpan nilai
        double[] nilaiMhs = new double[n];
        // Inisialisasi array cadangan untuk menampilkan nilai sebelum diurutkan nanti
        double[] nilaiSebelumUrut = new double[n];

        System.out.println("\n--- Input Nilai Mahasiswa ---");
        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilaiMhs[i] = input.nextDouble();
            // Menyalin nilai ke array cadangan
            nilaiSebelumUrut[i] = nilaiMhs[i];
        }

        // TAHAPAN B: Menghitung statistik nilai
        // Menentukan KKM (Kriteria Ketuntasan Minimal) dalam variabel yang bisa diubah
        double kkm = 70.0;
        double totalNilai = 0;
        double nilaiTertinggi = nilaiMhs[0];
        double nilaiTerendah = nilaiMhs[0];
        int jumlahLulus = 0;
        int jumlahTidakLulus = 0;
        for (int i = 0; i < n; i++) {
            // 1. Menghitung total nilai untuk rata-rata
            totalNilai += nilaiMhs[i];

            // 2. Mencari nilai tertinggi
            if (nilaiMhs[i] > nilaiTertinggi) {
                nilaiTertinggi = nilaiMhs[i];
            }

            // 3. Mencari nilai terendah
            if (nilaiMhs[i] < nilaiTerendah) {
                nilaiTerendah = nilaiMhs[i];
            }

            // 4. Menghitung jumlah kelulusan berdasarkan KKM
            if (nilaiMhs[i] >= kkm) {
                jumlahLulus++;
            } else {
                jumlahTidakLulus++;
            }
        }

        // Menghitung rata-rata kelas
        double rataRata = totalNilai / n;


        // TAHAPAN C: Mengurutkan array nilai secara ascending menggunakan Bubble Sort
        // Algoritma membandingkan elemen yang bersebelahan dan menukarnya jika urutannya salah
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (nilaiMhs[j] > nilaiMhs[j + 1]) {
                    // Proses pertukaran (swap) menggunakan variabel sementara
                    double temp = nilaiMhs[j];
                    nilaiMhs[j] = nilaiMhs[j + 1];
                    nilaiMhs[j + 1] = temp;
                }
            }
        }


        // TAHAPAN D: Menampilkan seluruh hasil dalam format laporan yang rapi
        System.out.println("\n=============================================");
        System.out.println("          LAPORAN HASIL NILAI KELAS          ");
        System.out.println("=============================================");
        System.out.printf(" KKM yang Berlaku             : %.1f\n", kkm);
        System.out.println(" Jumlah Mahasiswa (N)         : " + n);
        System.out.println("---------------------------------------------");

        // Menampilkan array nilai sebelum diurutkan
        System.out.print(" Nilai Sebelum Diurutkan     : [ ");
        for (int i = 0; i < n; i++) {
            System.out.print(nilaiSebelumUrut[i] + " ");
        }
        System.out.println("]");

        // Menampilkan array nilai setelah diurutkan (ascending)
        System.out.print(" Nilai Sesudah Diurutkan     : [ ");
        for (int i = 0; i < n; i++) {
            System.out.print(nilaiMhs[i] + " ");
        }
        System.out.println("]");

        System.out.println("----------------------------------------------");
        System.out.printf(" Nilai Rata-rata Kelas        : %.2f\n", rataRata);
        System.out.printf(" Nilai Tertinggi              : %.1f\n", nilaiTertinggi);
        System.out.printf(" Nilai Terendah               : %.1f\n", nilaiTerendah);
        System.out.println("---------------------------------------------");
        System.out.println(" Jumlah Mahasiswa LULUS       : " + jumlahLulus + " orang");
        System.out.println(" Jumlah Mahasiswa TIDAK LULUS : " + jumlahTidakLulus + " orang");
        System.out.println("===============================================");
        input.close();
    }
}

