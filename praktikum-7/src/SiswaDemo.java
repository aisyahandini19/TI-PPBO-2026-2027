public class SiswaDemo {
    public static void main(String[] args) {
        Siswa siswa = new Siswa(90);

        System.out.println("Nilai: " + siswa.getNilai());
        System.out.println("Nilai huruf: " + siswa.getNilaiHuruf());

        siswa.setNilai(78);
        System.out.println("Nilai baru: " + siswa.getNilai());
        System.out.println("Nilai huruf: " + siswa.getNilaiHuruf());

        siswa.setNilai(150);
        System.out.println("Nilai setelah validasi: " + siswa.getNilai());
    }
}
