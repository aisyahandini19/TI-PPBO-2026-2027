public class ProdukTugas {
    String kodeProduk;
    String namaProduk;
    double harga;
    int stok;

    // Constructor dengan parameter
    public ProdukTugas(String kodeProduk, String namaProduk,
                       double harga, int stok) {
        this.kodeProduk = kodeProduk;
        this.namaProduk = namaProduk;
        this.harga = harga;
        this.stok = stok;
    }

    // Menghitung total harga pembelian
    public double hitungTotalHarga(int jumlahBeli) {
        return harga * jumlahBeli;
    }

    // Mengurangi stok jika mencukupi
    public void kurangiStok(int jumlah) {
        if (stok >= jumlah) {
            stok = stok - jumlah;
            System.out.println("Pembelian berhasil.");
            System.out.println("Sisa stok: " + stok);
        } else {
            System.out.println("Stok tidak mencukupi");
        }
    }

    // Menampilkan seluruh data produk
    public void tampilkanData() {
        System.out.println("Kode Produk : " + kodeProduk);
        System.out.println("Nama Produk : " + namaProduk);
        System.out.println("Harga       : Rp" + harga);
        System.out.println("Stok        : " + stok);
    }
}