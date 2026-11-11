//public class BangunDatarDemo {
//    public static void main(String[] args) {
//        // Membuat array campuran bertipe superclass (BangunDatar)
//        BangunDatar[] daftarBangun = {
//                new Lingkaran(7),
//                new Persegi(5),
//                new Lingkaran(10)
//        };
//
//        double totalLuas = 0;
//
//        // Perulangan polimorfik
//        for (BangunDatar bd : daftarBangun) {
//            // Java otomatis memilih method milik objek asli (Lingkaran/Persegi) saat runtime
//            totalLuas += bd.hitungLuas();
//        }
//
//        System.out.println("Total Luas seluruh bangun: " + totalLuas);
//    }
//}