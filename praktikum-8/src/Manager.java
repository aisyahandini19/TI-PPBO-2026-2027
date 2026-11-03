public class Manager extends Pegawai{
    private double tunjanganJabatan;
    public Manager(String nama, String nip, double gajiPokok, double tunjanganJabatan){
        super(nama, nip, gajiPokok); //panggil coustructor pegawai
        this.tunjanganJabatan = tunjanganJabatan;
    }
    public void tampikanRingkasan() {
        System.out.println("Manager: " + nama);
    }
}
