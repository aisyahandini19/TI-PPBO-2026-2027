public class LatihanClass {
    public static void main (String[] args){
        Mahasiswa m1 = new Mahasiswa("Budi", "111", 3.5);
        System.out.println("Nama: " + m1.getNama());
        System.out.println("IPK: " + m1.getIpk());

        m1.setIpk(3.8);
        System.out.println("IK sekarang: " + m1.getIpk());

        m1.setIpk(9.9);
        System.out.println("ik sekarang: " +m1.getIpk());

    }
}