public class CapitalToSmallAscii {
    public static void main(String[] args) {
        char[][] alphabet = new char[2][13];

        char ch1 = 'a';
        int num = 0;

        for (int i = 0; i < alphabet.length; i++) {
            for (int j = 0; j < alphabet[i].length; j++) {
                num = (int) ch1;
                alphabet[i][j] = (char) num;
                System.out.print(alphabet[i][j] + ",");
                ch1++;
            }
            System.out.println("");
        }
    }
}
