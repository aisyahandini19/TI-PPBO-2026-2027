public class Persegi {
    double sisi;
    public Persegi(double sisi){
        this.sisi = sisi;
    }
    //menghitung luas persegi
    public double hitungLuas(){
        return sisi * sisi;
    }
    // menghitung keliling persegi
    public double hitungKeliling(){
        return 4 * sisi;
    }
}
