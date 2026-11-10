public class KebunBinatangDemo {
    public static void main(String[] args) {
//        // Uji Coba Override Dasar (Langkah 3)
//        Kucing k = new Kucing("Milo");
//        Anjing a = new Anjing("Rex");
//        k.bersuara();
//        a.bersuara();
//        // Reference Bertipe Superclass, Object Bertipe Subclass (Langkah 4)
//        Hewan h1 = new Kucing("Milo");
//        Hewan h2 = new Anjing("Rex");
//        h1.bersuara(); // Yang berjalan: versi Kucing akibat Dynamic Binding
//        h2.bersuara(); // Yang berjalan: versi Anjing akibat Dynamic Binding
        // Array Bertipe Superclass / Polimorfik (Langkah 5)
        Hewan[] daftarHewan = {
                new Kucing("Milo"),
                new Anjing("Rex"),
                new Kucing("Oyen")
        };
        // Perulangan polimorfik tanpa if-else pengecekan jenis objek
        for (Hewan h : daftarHewan) {
            h.bersuara();
        }
    }
}
