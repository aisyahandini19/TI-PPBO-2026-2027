import java.util.Scanner;
public class Latihan6BubbleSortAscending {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //memintak jumlah elemen
        System.out.print("Masukkan jumlah elemen: ");
        int jumlah = input.nextInt();

        int[] angka = new int[jumlah];

        // Mengisi array
        for (int i = 0; i < angka.length; i++) {
            System.out.print("Angka ke-" + (i + 1) + ": ");
            angka[i] = input.nextInt();
        }

        // Menampilkan array sebelum diurutkan
        System.out.println("\nArray sebelum diurutkan:");

        for (int i = 0; i < angka.length; i++) {
            System.out.print(angka[i] + " ");
        }
        //Bubble sort
        for (int i = 0 ; i < angka.length -1; i++){
            for (int j = 0 ; j < angka.length - 1 - i; j++){
            if (angka[i] > angka [j + 1]){
                // Menukar nilai
                int temp = angka[j];
                angka[j] = angka[j + 1];
                angka[j + 1] = temp;
             }
         }
    }
                // menampilkan array setelah diurutkan
                System.out.println("\n\nArray setelah diurutkan:");
                for ( int i = 0; i < angka.length; i++){
                 System.out.print(angka[i] + " ");
          }
    }
}