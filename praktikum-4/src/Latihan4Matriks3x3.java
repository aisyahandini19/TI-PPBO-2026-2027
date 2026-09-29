import java.util.Scanner;
public class Latihan4Matriks3x3 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int [][] matriks = new int [3][3];
        // Mengisi matriks
        System.out.println("Masukkan elemen matriks 3x3:");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Baris " + (i + 1) + ", Kolom " + (j + 1) + ": ");
                matriks[i][j] = input.nextInt();
            }
        }
        // Menampilkan matriks
        System.out.println("\nMatriks:");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriks[i][j] + "\t");
            }
            System.out.println();
        }

        // Menghitung jumlah setiap baris
        System.out.println("\nJumlah setiap baris:");

        int total = 0;

        for (int i = 0; i < 3; i++) {
            int jumlahBaris = 0;

            for (int j = 0; j < 3; j++) {
                jumlahBaris += matriks[i][j];
                total += matriks[i][j];
            }
            System.out.println("jumlah baris " + (i + 1) + "=" + jumlahBaris);
        }
        //jumlah seluruh elemen
        System.out.println("Jumlah seluruh elemen = " + total);
    }
}
