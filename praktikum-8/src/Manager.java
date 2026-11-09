public class Manager extends Pegawai {
    private double tunjanganJabatan;

    public Manager(String nama, String nip, double gajiPokok, double tunjanganJabatan) {
        super(nama, nip, gajiPokok); // Memanggil constructor Pegawai
        this.tunjanganJabatan = tunjanganJabatan;
    }

    public void tampikanRingkasan() {
        System.out.println("Manager: " + nama);
    }

    public double getTunjanganJabatan() {
        return tunjanganJabatan;
    }
}