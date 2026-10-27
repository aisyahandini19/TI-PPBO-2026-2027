public class RekeningBank {

    // Atribut private agar tidak diakses langsung dari luar class
    private String nomorRekening;
    private String pemilik;
    private final String jenisRekening; // Read-only: hanya diisi melalui constructor
    private double saldo;

    // Constructor untuk mengisi data awal rekening
    public RekeningBank(String nomorRekening, String pemilik,
                        String jenisRekening, double saldoAwal) {
        this.nomorRekening = nomorRekening;
        this.pemilik = pemilik;
        this.jenisRekening = jenisRekening;

        if (saldoAwal >= 0) {
            this.saldo = saldoAwal;
        } else {
            this.saldo = 0;
            System.out.println("Saldo awal tidak valid. Saldo diatur menjadi Rp0.");
        }
    }

    // Getter dan setter nomor rekening
    public String getNomorRekening() {
        return nomorRekening;
    }

    public void setNomorRekening(String nomorRekening) {
        if (nomorRekening != null && !nomorRekening.trim().isEmpty()) {
            this.nomorRekening = nomorRekening;
        } else {
            System.out.println("Nomor rekening tidak boleh kosong.");
        }
    }

    // Getter dan setter nama pemilik
    public String getPemilik() {
        return pemilik;
    }

    public void setPemilik(String pemilik) {
        if (pemilik != null && !pemilik.trim().isEmpty()) {
            this.pemilik = pemilik;
        } else {
            System.out.println("Nama pemilik tidak boleh kosong.");
        }
    }

    // Getter jenis rekening saja, tanpa setter karena read-only
    public String getJenisRekening() {
        return jenisRekening;
    }

    // Getter saldo saja; perubahan saldo harus melalui transaksi
    public double getSaldo() {
        return saldo;
    }

    // Method untuk menyetor uang
    public void setor(double jumlah) {
        if (jumlah <= 0) {
            System.out.println("Setor GAGAL: jumlah setor harus lebih dari Rp0.");
        } else {
            saldo += jumlah;
            System.out.printf("Setor BERHASIL: %s menerima Rp%,.2f.%n",
                    pemilik, jumlah);
        }
    }

    // Method untuk menarik uang
    public void tarik(double jumlah) {
        if (jumlah <= 0) {
            System.out.println("Tarik GAGAL: jumlah penarikan harus lebih dari Rp0.");
        } else if (jumlah > saldo) {
            System.out.println("Tarik GAGAL: saldo " + pemilik + " tidak mencukupi.");
        } else {
            saldo -= jumlah;
            System.out.printf("Tarik BERHASIL: %s menarik Rp%,.2f.%n",
                    pemilik, jumlah);
        }
    }

    // Method untuk mentransfer uang ke rekening lain
    public void transferKe(RekeningBank tujuan, double jumlah) {
        if (tujuan == null) {
            System.out.println("Transfer GAGAL: rekening tujuan tidak ditemukan.");
        } else if (tujuan == this) {
            System.out.println("Transfer GAGAL: rekening tujuan tidak boleh sama.");
        } else if (jumlah <= 0) {
            System.out.println("Transfer GAGAL: jumlah transfer harus lebih dari Rp0.");
        } else if (jumlah > saldo) {
            System.out.println("Transfer GAGAL: saldo pengirim tidak mencukupi.");
        } else {
            // Saldo baru diubah setelah seluruh validasi lolos
            saldo -= jumlah;
            tujuan.saldo += jumlah;

            System.out.printf(
                    "Transfer BERHASIL: %s mentransfer Rp%,.2f kepada %s.%n",
                    pemilik, jumlah, tujuan.pemilik
            );
        }
    }

    // Method untuk menampilkan laporan mutasi rekening
    public void cetakMutasi() {
        System.out.println("----------------------------------------");
        System.out.println("          LAPORAN MUTASI REKENING");
        System.out.println("----------------------------------------");
        System.out.println("Nomor Rekening : " + nomorRekening);
        System.out.println("Pemilik        : " + pemilik);
        System.out.println("Jenis Rekening : " + jenisRekening);
        System.out.printf("Saldo Saat Ini : Rp%,.2f%n", saldo);
        System.out.println("----------------------------------------");
    }
}
