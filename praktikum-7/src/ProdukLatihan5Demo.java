
public class ProdukLatihan5Demo {
    public static void main(String[] args) {
        Produk_Latihan5 produk = new Produk_Latihan5(
                "P001", "Keyboard", 150000, 10
        );

        System.out.println("=== Data Awal ===");
        produk.tampilkanData();

        System.out.println("\n=== Uji Validasi ===");
        produk.setHarga(-5000);
        produk.tambahStok(5);
        produk.tambahStok(-2);
        produk.kurangiStok(3);
        produk.kurangiStok(20);

        System.out.println("\n=== Data Akhir ===");
        produk.tampilkanData();
    }
}
