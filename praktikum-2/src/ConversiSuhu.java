import java.util.Scanner;
public class ConversiSuhu {
    public  static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Masukkan suhu dalam celsius: ");
        double calcius = sc.nextDouble();

        double fahrenheit = calcius *9/5 +32;
        System.out.println(calcius + "derajat" + fahrenheit + "derajat");

    }

}
