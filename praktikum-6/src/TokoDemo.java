public class TokoDemo {
    public static void main(String[] args) {

        // Membuat array of object berisi 5 produk
        ProdukTugas[] daftarProduk = new ProdukTugas[5];

        daftarProduk[0] = new ProdukTugas("P001", "Buku", 15000, 10);
        daftarProduk[1] = new ProdukTugas("P002", "Pulpen", 5000, 20);
        daftarProduk[2] = new ProdukTugas("P003", "Tas", 150000, 5);
        daftarProduk[3] = new ProdukTugas("P004", "Laptop", 6500000, 3);
        daftarProduk[4] = new ProdukTugas("P005", "Penggaris", 7000, 15);

        // Menampilkan seluruh data produk
        System.out.println("=== DATA SELURUH PRODUK ===");

        for (ProdukTugas p : daftarProduk) {
            p.tampilkanData();
            System.out.println("---------------------------");
        }

        // Pembelian pertama: stok mencukupi
        System.out.println("\n=== PEMBELIAN PERTAMA ===");

        int jumlahBeli1 = 3;

        System.out.println("Produk: " + daftarProduk[0].namaProduk);
        System.out.println("Jumlah beli: " + jumlahBeli1);
        System.out.println("Total harga: Rp"
                + daftarProduk[0].hitungTotalHarga(jumlahBeli1));

        daftarProduk[0].kurangiStok(jumlahBeli1);

        // Pembelian kedua: stok tidak mencukupi
        System.out.println("\n=== PEMBELIAN KEDUA ===");

        int jumlahBeli2 = 5;

        System.out.println("Produk: " + daftarProduk[3].namaProduk);
        System.out.println("Jumlah beli: " + jumlahBeli2);
        System.out.println("Total harga: Rp"
                + daftarProduk[3].hitungTotalHarga(jumlahBeli2));

        daftarProduk[3].kurangiStok(jumlahBeli2);

        // Mencari produk dengan harga termahal
        System.out.println("\n=== PRODUK DENGAN HARGA TERMAHAL ===");

        ProdukTugas termahal = daftarProduk[0];

        for (ProdukTugas p : daftarProduk) {
            if (p.harga > termahal.harga) {
                termahal = p;
            }
        }

        termahal.tampilkanData();
    }
}
