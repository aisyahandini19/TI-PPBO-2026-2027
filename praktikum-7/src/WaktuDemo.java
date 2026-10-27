public class WaktuDemo {
    public static void main(String[] args) {
        Waktu waktu = new Waktu(10, 30, 45);

        System.out.println("Waktu awal: "
                + waktu.getJam() + ":"
                + waktu.getMenit() + ":"
                + waktu.getDetik());

        waktu.setJam(25);
        waktu.setMenit(70);
        waktu.setDetik(20);

        System.out.println("Waktu akhir: "
                + waktu.getJam() + ":"
                + waktu.getMenit() + ":"
                + waktu.getDetik());
    }
}