public class Produk {
    String namaProduk;
    double harga;

    //constructor berparameter
    public Produk(String namaProduk, double harga){
        this.namaProduk = namaProduk;
        this.harga = harga;
    }
    //memriksa apakah harga produk melebihi batas harga
    public boolean isMahal(double bataHarga){
        return harga > bataHarga;
    }
}
