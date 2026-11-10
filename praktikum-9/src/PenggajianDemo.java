public class PenggajianDemo {
    public static void main(String[] args) {
        // Membuat susunan array pegawai secara polimorfik
        Pegawai[] daftarPegawai = {
                new Manager("Budi", "M001", 3000000, 1000000),
                new Staff("Siti", "S001", 2000000, 500000),
                new Staff("Andi", "S002", 2000000, 300000),
                new Direktur("Hamdi", "D001", 3000000, 500000, 1500000) // Penambahan objek Direktur
        };

        double totalGaji = 0;

        // Memproses hitung gaji menggunakan satu perulangan tunggal
        for (Pegawai pg : daftarPegawai) {
            double gaji = pg.hitungGaji(); // Memanfaatkan konsep dynamic binding
            System.out.println(pg.nama + ": " + gaji);
            totalGaji += gaji;
        }

        System.out.println("Total gaji: " + totalGaji);
    }
}
