public class Direktur extends Manager {
    private double tunjanganSaham;

    // Constructor lengkap menyalurkan data ke constructor Manager lewat super()
    public Direktur(String nama, String nip, double gajiPokok, double tunjanganJabatan, double tunjanganSaham) {
        super(nama, nip, gajiPokok, tunjanganJabatan);
        this.tunjanganSaham = tunjanganSaham;
    }

    // Override hitungGaji dengan memanfaatkan super.hitungGaji() milik Manager
    @Override
    public double hitungGaji() {
        return super.hitungGaji() + tunjanganSaham;
    }
}