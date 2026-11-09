
public class PerusahaanDemo {
    public static void main(String[] args) {

        // Membuat objek Manager
        Manager manager = new Manager(
                "Ahmad", "1001", 5000000, 1500000
        );

        // Membuat objek Staff
        Staff staff = new Staff(
                "Siti", "1002", 3000000, 500000
        );

        // Membuat objek Direktur
        Direktur direktur = new Direktur(
                "Aisyah", "1003", 10000000, 3000000, 5000000
        );

        System.out.println("==========================================");
        System.out.println("        SISTEM INFORMASI KEPEGAWAIAN");
        System.out.println("==========================================");

        System.out.println("\n              DATA MANAGER");
        System.out.println("------------------------------------------");
        manager.tampilkanData();

        System.out.println("\n               DATA STAFF");
        System.out.println("------------------------------------------");
        staff.tampilkanData();

        System.out.println("\n              DATA DIREKTUR");
        System.out.println("------------------------------------------");
        direktur.tampilkanData();

        System.out.println("==========================================");
        System.out.println("          DATA BERHASIL DITAMPILKAN");
        System.out.println("==========================================");
    }
}
