public class Latihan4 {
    public static void main(String[] args){
        Buku[] daftarBuku = new Buku[4];

        daftarBuku[0] = new Buku("Laut Bercarita", "Leila S.Chudori", 1998);
        daftarBuku[1] = new Buku("Baru Dunia", "Peter Frankopan", 2018);
        daftarBuku[2] = new Buku("Bumi", "Tere Liye", 2014);
        daftarBuku[3] = new Buku("Pulang", "Tere Liye", 2021);

        System.out.println("Buku yang terbit setelah tahun 2015: ");
        for (Buku buku : daftarBuku){
            if (buku.tahunTerbit > 2015){
                System.out.println(buku.judul);
            }
        }
    }
}
