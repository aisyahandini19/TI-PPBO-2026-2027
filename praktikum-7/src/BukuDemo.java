public class BukuDemo {
    public static void main(String[] args) {
        Buku buku1 = new Buku(
                "Laskar Pelangi", "Andrea Hirata", 2005
        );

        System.out.println("Judul: " + buku1.getJudul());
        System.out.println("Pengarang: " + buku1.getPengarang());
        System.out.println("Tahun Terbit: " + buku1.getTahunTerbit());
    }
}
