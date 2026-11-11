public class BangunDatar {
    // Atribut protected diisi lewat constructor (Poin a)
    protected String namaBangun;

    // Constructor superclass
    public BangunDatar(String namaBangun) {
        this.namaBangun = namaBangun;
    }
    // Method default mengembalikan nilai 0
    public double hitungLuas() {
        return 0;
    }
    public double hitungKeliling() {
        return 0;
    }
    // Method cetak info otomatis menggunakan dynamic binding (Poin c)
    public void tampilkanInfo() {
        System.out.println("Nama Bangun : " + namaBangun);
        System.out.println("Luas        : " + hitungLuas()); // Polimorfik saat runtime
        System.out.println("Keliling    : " + hitungKeliling()); // Polimorfik saat runtime
        System.out.println("---------------------------------");
    }
}