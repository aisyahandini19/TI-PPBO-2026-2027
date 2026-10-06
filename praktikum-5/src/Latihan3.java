public class Latihan3 {
        // Versi 1: Menerima 1 parameter celsius, otomatis diubah ke skala Fahrenheit
        static double konversiSuhu(double celsius) {
            return (celsius * 9 / 5) + 32; // Rumus matematika Celsius ke Fahrenheit
        }

        // Versi 2: Menerima 2 parameter (suhu celsius dan teks tujuan konversi)
        static double konversiSuhu(double celsius, String skalaTujuan) {
            // equalsIgnoreCase digunakan agar ketikan huruf besar/kecil tidak berpengaruh
            if (skalaTujuan.equalsIgnoreCase("K")) {
                return celsius + 273.15; // Jika teks tujuan adalah "K", ubah ke Kelvin
            } else if (skalaTujuan.equalsIgnoreCase("F")) {
                return (celsius * 9 / 5) + 32; // Jika teks tujuan adalah "F", ubah ke Fahrenheit
            } else {
                System.out.println("Skala tidak dikenal!"); // Pengaman jika teks masukan salah
                return 0; // Mengembalikan nilai 0 jika kondisi tidak terpenuhi
            }
        }

        // Fungsi utama untuk menjalankan program
        public static void main(String[] args) {
            System.out.println("=== OVERLOADING KONVERSI SUHU ===");

            // Menguji fungsi versi 1 (Satu parameter)
            System.out.println("100C ke Fahrenheit (Versi 1): " + konversiSuhu(100.0));

            // Menguji fungsi versi 2 dengan tujuan ke Kelvin ("K")
            System.out.println("25C ke Kelvin (Versi 2): " + konversiSuhu(25.0, "K"));

            // Menguji fungsi versi 2 dengan tujuan ke Fahrenheit ("F")
            System.out.println("25C ke Fahrenheit (Versi 2): " + konversiSuhu(25.0, "F"));
        }
    }