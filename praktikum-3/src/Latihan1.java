import java.util.Scanner;
public class Latihan1 {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan bilangan: ");
        int bilangan = input.nextInt();

        if (bilangan % 2 == 0) {
            System.out.println("Bilangan adalah GENAP");
        }else {
            System.out.println("Bilangan adalahan ganjil");
        }
    }

}
