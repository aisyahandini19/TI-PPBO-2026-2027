public class OperasiArray {
    public static void main(String[] args){
        int[] nilai = { 80,75,90,60,88};
        int total = 0;

        for (int n : nilai){
            total += n;
        }
        double rataRata = (double) total /nilai.length;

        System.out.println("Total: " + total);
        System.out.println("Rata-rata: " + rataRata);
        //LANGKAH 11

        int cari = 90;
        int posisi = -1;// -1 berarti belum/ tidak ditemukan
        for (int i = 0; i < nilai.length; i++){
            if (nilai[i] == cari){
                posisi = i;
                break;
            }
        }
        if (posisi != -1){
            System.out.println("Nilai " + cari + " ditemukan indeks " + posisi);
        }else {
            System.out.println("Nilai " + cari + "tidak ditemukan");
        }

    }
}
