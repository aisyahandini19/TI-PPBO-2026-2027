public class Latihan5 {
    static int hitungTotal(int[]data){
        int total = 0;
        for (int nilai : data){
            total += nilai;
        }
        return total;
    }
    static int[] filterDiAtasRataRata(int[] data){
        double rataRata = (double) hitungTotal(data) / data.length;
        int hitung = 0;
        for (int nilai :data){
            if (nilai > rataRata){
                hitung++;
            }
        }
        int[]arryBaru = new int[hitung];
        int indeks = 0;
        for (int nilai : data){
            if (nilai > rataRata) {
                arryBaru[indeks] = nilai;
                indeks++;
            }
        }
        return arryBaru;
    }
    public static void main(String[] args) {
        // Contoh data array statis untuk menguji fungsi
        int[] dataUjian = {70, 85, 60, 90, 75};

        System.out.println("=== FILTER DATA ARRAY ===");
        System.out.println("Total Nilai Keseluruhan: " + hitungTotal(dataUjian));

        // Memanggil fungsi filter lalu menyimpannya ke dalam variabel array baru bernama hasil
        int[] hasil = filterDiAtasRataRata(dataUjian);
        System.out.print("Elemen Yang Nilainya Di Atas Rata-Rata: ");
        for (int nilai : hasil) {
            System.out.print(nilai + " ");
        }
        System.out.println();
    }
}
