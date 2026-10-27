public class BankDemo {
    public static void main(String[] args) {

        // Membuat dua objek rekening bank
        RekeningBank rekening1 = new RekeningBank(
                "001", "Aisyah", "Tabungan",1000000
        );

        RekeningBank rekening2 = new RekeningBank(
                "002", "Andini", "Giro", 500000
        );

        System.out.println("========================================");
        System.out.println("       DEMONSTRASI TRANSAKSI BANK");
        System.out.println("========================================");

        // Skenario 1: Setor uang ke rekening pertama
        System.out.println("\n[SKENARIO 1] Setor rekening Aisyah");
        rekening1.setor(200000);

        // Skenario 2: Setor uang ke rekening kedua
        System.out.println("\n[SKENARIO 2] Setor rekening Andini");
        rekening2.setor(100000);

        // Skenario 3: Tarik uang dari rekening pertama
        System.out.println("\n[SKENARIO 3] Tarik rekening Aisyah");
        rekening1.tarik(150000);

        // Skenario 4: Tarik uang dari rekening kedua
        System.out.println("\n[SKENARIO 4] Tarik rekening Andini");
        rekening2.tarik(50000);

        // Skenario 5: Transfer berhasil dari rekening pertama ke kedua
        System.out.println("\n[SKENARIO 5] Transfer berhasil");
        rekening1.transferKe(rekening2, 300000);

        // Skenario 6: Transfer gagal karena saldo tidak mencukupi
        System.out.println("\n[SKENARIO 6] Transfer gagal");
        rekening1.transferKe(rekening2, 2000000);

        // Skenario 7: Setor gagal karena jumlah tidak valid
        System.out.println("\n[SKENARIO 7] Setor gagal");
        rekening2.setor(-50000);

        // Skenario 8: Tarik gagal karena jumlah tidak valid
        System.out.println("\n[SKENARIO 8] Tarik gagal");
        rekening2.tarik(0);

        // Skenario 9: Transfer gagal karena jumlah negatif
        System.out.println("\n[SKENARIO 9] Transfer dengan jumlah negatif");
        rekening1.transferKe(rekening2, -100000);

        // Menampilkan mutasi akhir kedua rekening
        System.out.println("\n========================================");
        System.out.println("          MUTASI AKHIR REKENING");
        System.out.println("========================================");

        rekening1.cetakMutasi();
        rekening2.cetakMutasi();
    }
}
