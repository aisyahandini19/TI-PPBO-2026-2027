public class LatihanClass {
    public static void main (String[] args){
        Mahasiswa m1 = new Mahasiswa("Budi", "111", 3.5);
        m1.ipk = 9.9; //seharusnya TIDAK MASUK AKAL, IPK maksimal 4.0
        m1.nim =""; //nim kosong, seharusnya tidak valid
        System.out.println(m1.ipk); //program tetap 'menerima' nilai yang salah

//        Mahasiswa m2 = new Mahasiswa("Siti" ,"67890", 3.90);// berparameter
//        m2.tampilkanData();
//        System.out.println("Cumlaude? " + m2.isCumlaude());

    }
}