public class Bebek extends Hewan {
        // Constructor mengirim variabel nama ke kelas induk (Hewan)
        public Bebek(String nama) {
            super(nama);
        }
        // Meng-override method bersuara milik kelas Hewan
        @Override
        public void bersuara() {
            System.out.println(nama + ": Kwek-wek!");
        }
    }