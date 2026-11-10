public class Persegi extends BangunDatar {
    private double sisi;

    public Persegi(double sisi) {
        this.sisi = sisi;
    }

    // Override rumus luas persegi
    @Override
    public double hitungLuas() {
        return sisi * sisi;
    }
}