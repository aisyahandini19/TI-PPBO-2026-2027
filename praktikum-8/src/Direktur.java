public class Direktur extends Manager {
    private double tunjanganSaham;

    // constructor Direktur
    public Direktur(String nama, String nip, double gajiPokok,
                    double tunjanganJabatan, double tunjanganSaham) {
        super(nama, nip, gajiPokok, tunjanganJabatan);
        this.tunjanganSaham = tunjanganSaham;
    }

    // getter untuk tunjangan saham
    public double getTunjanganSaham() {
        return tunjanganSaham;
    }

    // method untuk menampilkan ringkasan Direktur
    public void tampilkanRingkasan() {
        System.out.println("Direktur: " + nama);
        System.out.println("Tunjangan jabatan: " + getTunjanganJabatan());
        System.out.println("Tunjangan saham: " + tunjanganSaham);
    }
}
