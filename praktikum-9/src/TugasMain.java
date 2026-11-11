public class TugasMain {
    public static void main(String[] args) {
        // a. Membuat array bertipe BangunDatar berisi minimal 5 objek campuran (Poin d)
        BangunDatar[] daftarBangun = {
                new Lingkaran("Lingkaran Besar", 10),
                new Persegi("Persegi Kecil", 4),
                new PersegiPanjang("Persegi Panjang A", 8, 5),
                new Lingkaran("Lingkaran Kecil", 3),
                new Persegi("Persegi Jumbo", 12)
        };

        double totalLuas = 0;
        // Inisialisasi awal objek pembanding nilai terbesar dengan indeks ke-0
        BangunDatar bangunTerbesar = daftarBangun[0];

        System.out.println("=== OUTPUT TAMPILKAN INFO PADA ARRAY ===");

        // b. Perulangan polimorfik untuk memproses array (Poin d)
        for (BangunDatar bd : daftarBangun) {
            // Memanggil method tampilkanInfo() langsung dari tipe superclass (Poin c)
            bd.tampilkanInfo();

            // c. Menghitung akumulasi total luas seluruh bangun (Poin d)
            totalLuas += bd.hitungLuas();

            // d. Logika pembanding untuk mencari nilai luas terbesar (Poin d)
            if (bd.hitungLuas() > bangunTerbesar.hitungLuas()) {
                bangunTerbesar = bd; // Menyimpan referensi objek dengan luas terbesar
            }
        }

        System.out.println("=== HASIL ANALISIS AKHIR ===");
        System.out.println("TOTAL LUAS SELURUH BANGUN : " + totalLuas);
        System.out.println("BANGUN DENGAN LUAS TERBESAR:");
        System.out.println("- Nama Bangun : " + bangunTerbesar.namaBangun);
        System.out.println("- Nilai Luas  : " + bangunTerbesar.hitungLuas());
    }
}
