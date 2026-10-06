public class MethodDemo {
    // method void : tidak mengambil nilai apa pun
    static void sapa(String nama){
        System.out.println("Hallo, " + nama + "!");
    }
    //method dengan lebih dari satu parameter
    static void tampilkanBiodata(String nama, int umur, String kota) {
        System.out.println(nama + " (" + umur + "tahun) - " + kota);
    }
    public static void main(String[] args){
        sapa("Budi");
        sapa("Siti");
        tampilkanBiodata("Budi", 20, "Bandung");
    }

}
