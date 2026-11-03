public class Kendaraan {
    protected String merek;
    protected int kecepatanMaks;

    public Kendaraan(String merek, int kecepatanMaks) {
        this.merek = merek;
        this.kecepatanMaks = kecepatanMaks;
    }
}
    class Mobil extends Kendaraan {
        int jumlahPintu;
        public Mobil(String merek, int kecepatanMaks, int jumlahPintu){
            super(merek, kecepatanMaks);
            this.jumlahPintu = jumlahPintu;
        }
    }
    class Motor extends Kendaraan {
    String jenisMotor;
    public Motor(String merek, int kecepatanMaks, String jenisMotor){
        super(merek, kecepatanMaks);
        this.jenisMotor =jenisMotor;
    }
}


