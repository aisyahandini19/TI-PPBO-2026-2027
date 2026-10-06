public class Latihan1 {
    static double luasPersegiPanjang(double p, double l){
        return p * l;
    }
    static double luaslingkaran(double r){
        return 3.14159 * r * r;
    }
    public static void main(String[] args) {
        System.out.println("UJI COBA LUAS GEOMETRI");
        System.out.println("Luas Persegi Panjang (5x4: " + luasPersegiPanjang(5.0, 4.0));
        System.out.println("Luas Lingkaran (r=7): " + luaslingkaran(7.0));
    }
}
