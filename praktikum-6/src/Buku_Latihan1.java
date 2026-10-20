public class Buku_Latihan1 {
    public static void main(String[] args){
        Buku buku1 = new Buku("Laut Bercarita", "Leila S.Chudori", 1998);
        Buku buku2 = new Buku ("Baru Dunia", "Peter Frankopan", 2015);

        System.out.println("Data Buku 1 ");
        buku1.tampilkanData();
        System.out.println();
        System.out.println("AData Buku 2 ");
        buku2.tampilkanData();
    }
}
