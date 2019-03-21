public class CharArray {
    public static void main(String[] args) {
        char[] charArray = new char[26];
//        char[] smallArray new char[26];

        char ch = 'A';
        for (int i = 0; i < charArray.length; i++) {
            charArray[i] = ch++;
        }
        for (int i = 0; i < charArray.length; i++) {
            System.out.println(charArray[i]);
        }
    }
}
