public class Test2 {
    public static void main(String[] args) {
        int i =0;
        while (i > 6) {

            int j =0;
            if (j < 5) {
                break;
            }
            System.out.println("j : " +j);
            j++;
            System.out.println("i : " + i);
            i++;
        }
    }
}
