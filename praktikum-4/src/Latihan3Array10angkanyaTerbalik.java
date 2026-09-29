import java.util.Scanner;
public class Latihan3Array10angkanyaTerbalik {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[] angka = new int[10];

        // Mengisi array
        System.out.println("Masukkan 10 angka:");

        for (int i = 0; i < angka.length; i++) {
            System.out.print("Angka ke-" + (i + 1) + ": ");
            angka[i] = input.nextInt();
        }
        //menapilkan array secara terbalik
        System.out.println("\nArray dalam urutan terbalik: ");
        for (int i = angka.length -1; i >= 0; i--){
            System.out.println(angka[i]);
        }
    }
}