import java.util.Scanner;
public class Latihan4 {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan umur: ");
        int umur = input.nextInt();

        System.out.print("Apakah mahasiswa? (true/false): ");
        boolean mahasiswa = input.hasNextBoolean() ;
        int harga;
        if (mahasiswa && umur < 25){
            harga = 25000;
            System.out.println("Mendapat harga khusus mahasiswa. ");

        }else {
            harga = 40000;
            System.out.println("Mendapat harga normal. ");

        }
        System.out.println("Harga tiket: Rp " + harga);
    }
}
