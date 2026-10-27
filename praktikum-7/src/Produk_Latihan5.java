
public class Produk_Latihan5 {
    private String kodeProduk;
    private String namaProduk;
    private double harga;
    private int stok;

    public Produk_Latihan5(
            String kodeProduk, String namaProduk,
            double harga, int stok
    ) {
        this.kodeProduk = kodeProduk;
        this.namaProduk = namaProduk;

        setHarga(harga);

        if (stok >= 0) {
            this.stok = stok;
        } else {
            this.stok = 0;
            System.out.println("Stok awal tidak boleh negatif");
        }
    }

    public String getKodeProduk() {
        return kodeProduk;
    }

    public String getNamaProduk() {
        return namaProduk;
    }

    public double getHarga() {
        return harga;
    }

    public int getStok() {
        return stok;
    }

    public void setHarga(double harga) {
        if (harga >= 0) {
            this.harga = harga;
        } else {
            System.out.println("Harga tidak boleh negatif");
        }
    }

    public void tambahStok(int jumlah) {
        if (jumlah > 0) {
            stok += jumlah;
            System.out.println("Stok berhasil ditambah");
        } else {
            System.out.println("Jumlah penambahan harus positif");
        }
    }

    public void kurangiStok(int jumlah) {
        if (jumlah <= 0) {
            System.out.println("Jumlah pengurangan harus positif");
        } else if (jumlah > stok) {
            System.out.println("Stok tidak mencukupi");
        } else {
            stok -= jumlah;
            System.out.println("Stok berhasil dikurangi");
        }
    }

    public void tampilkanData() {
        System.out.println("Kode produk: " + kodeProduk);
        System.out.println("Nama produk: " + namaProduk);
        System.out.println("Harga: " + harga);
        System.out.println("Stok: " + stok);
    }
}

