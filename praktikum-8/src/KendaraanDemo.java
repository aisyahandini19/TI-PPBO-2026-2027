public class KendaraanDemo {
    public static void main(String[] args) {
        Mobil mobil = new Mobil("Toyota", 180, 4);
        Motor motor = new Motor("Honda", 120, "Matic");

        System.out.println(mobil.merek);
        System.out.println(motor.merek);
    }
}