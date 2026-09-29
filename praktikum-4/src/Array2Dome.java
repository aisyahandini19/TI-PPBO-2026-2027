public class Array2Dome {
    public static void main(String[] args) {
        int[][] martiks = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        for (int baris = 0; baris < martiks.length; baris++) {
            for (int kolom = 0; kolom < martiks[baris].length; kolom++) {

                System.out.print(martiks[baris][kolom] + " ");
            }
            System.out.println();
        }
            // LANGKAH 13
            int totalMatriks = 0;
            for (int baris = 0; baris < martiks.length; baris++) {
                for (int kolom = 0; kolom < martiks[baris].length; kolom++) {
                    totalMatriks += martiks[baris][kolom];
                }
            }


            System.out.println("Total seleuruh elemen: " + totalMatriks);
        }
    }

