public class B {
    public static void main(String[] args) {
        String[][] letter = new String[7][4];

        for (int i = 0; i < letter.length; i++) {
            for (int j = 0; j < letter[i].length; j++) {
                // İlk ve üçüncü satırlar tamamen yıldız
                if (i == 0 || i == 3 || i == 6) {
                    letter[i][j] = " * ";
                }
                // İlk ve son sütunlar tamamen yıldız
                else if (j == 0 || j == 3) {
                    letter[i][j] = " * ";
                }
                // Diğer hücreler boş
                else {
                    letter[i][j] = "   ";
                }
            }
        }

        // Diziyi ekrana yazdırma
        for (String[] row : letter) {
            for (String col : row) {
                System.out.print(col);
            }
            System.out.println();
        }
    }
        

}
