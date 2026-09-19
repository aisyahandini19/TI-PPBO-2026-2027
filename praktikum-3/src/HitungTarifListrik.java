import java.util.Scanner;

public class HitungTarifListrik {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        //konstanta tarif listrik per kWh bedasarkan golongan daya
        final int TARIF_450 = 500;
        final int TARIF_900 = 1000;
        final int TARIF_1300 = 1500;
        final int TARIF_2200 = 1700;
        final int TARIF_DI_ATAS_2200 = 2000;

        // Input golongan daya listrik
        System.out.println("=== HITUNG TARIF LISTRIK ===");
        System.out.println("Pilihan golongan daya:");
        System.out.println("1. 450 VA");
        System.out.println("2. 900 VA");
        System.out.println("3. 1300 VA");
        System.out.println("4. 2200 VA");
        System.out.println("5. Di atas 2200 VA");

        System.out.print("Masukkan pilihan golongan daya (1-5): ");
        int pilihan = input.nextInt();

        //input jumlah pemakaian listrik
        System.out.print("Masukkan jumlah pemakaian listrik(kWh): ");
        double kWh = input.nextDouble();

        String golongan;
        int tarif = 0;

        // Menentukan golongan dan tarif menggunakan switch-case
        switch (pilihan){
        case 1:
        golongan = "450 VA";
        tarif = TARIF_450;
        break;

        case 2:
        golongan = "900 VA";
        tarif = TARIF_900;
        break;

        case 3:

        golongan = "1300 VA";
        tarif = TARIF_1300;
        break;

        case 4:
        golongan = "2200 VA";
        tarif = TARIF_2200;
        break;

        case 5:
        golongan = "Di atas 2200 VA";
        tarif = TARIF_DI_ATAS_2200;
        break;

        default:

        System.out.println("Error: Pilihan golongan daya tidak valid.");
        input.close();
        return;
    }
    //validasi jumlah kWh menggunakan operator logika
    if (kWh <= 0)

    {
        System.out.println("Error: jumlah pemakaian kWh harus lebih dari 0.");
        input.close();
    }
    //menghitung total tagihan
    double totalTagihan = kWh * tarif;
    // menapilkan total tagihan
    System.out.println();

    System.out.println("=================================");
    System.out.println(" HASIL TAGIHAN LISTRIK");
    System.out.println("=================================");
    System.out.println("Golongan Daya : " + golongan);
    System.out.printf("Pemakaian : %.2f kWh%n", kWh);
    System.out.println("Tarif per kWh : Rp" + tarif);
    System.out.printf("Total Tagihan : Rp%.2f%n", totalTagihan);
    System.out.println("=================================");
    input.close();
    }
}
