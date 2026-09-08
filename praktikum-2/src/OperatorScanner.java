import  java.util.Scanner;
public class OperatorScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Maukkan bilang pertama: ");
        int a = sc.nextInt();

        System.out.println("Maukkan bilang kedua: ");
        int b = sc.nextInt();

        //artimatika
        System.out.println("Perulangan: " + (a + b));
        System.out.println("Pengurangan: " + (a - b));
        System.out.println("Perkalian: " + (a * b));
        System.out.println("Pembagian: " + (a / b));
        System.out.println("Modulus: " + (a % b));

        //ini opera
        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a == b: " + (a == b));
        sc.close();
    }
}
