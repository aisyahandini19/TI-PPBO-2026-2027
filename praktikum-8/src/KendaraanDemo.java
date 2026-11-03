public class KendaraanDemo {
    public static void main(String[] args) {

        Mobil mobil = new Mobil();
        mobil.merek = "Toyota";
        mobil.kecepatanMaks = 180;
        mobil.jumlahPintu = 4;

        Motor motor = new Motor();
        motor.merek = "Honda";
        motor.kecepatanMaks = 120;
        motor.jenisMotor = "Matic";

        System.out.println(mobil.merek);
        System.out.println(mobil.kecepatanMaks);
        System.out.println(mobil.jumlahPintu);

        System.out.println(motor.merek);
        System.out.println(motor.kecepatanMaks);
        System.out.println(motor.jenisMotor);
    }
}