package sort;

import java.util.Arrays;
import java.util.Comparator;

public class SortTest {
    public static void main(String[] args) {

        Integer[] list = new Integer[] {5,3,768,223};

        Arrays.sort(list, new comparetorMyInt());

        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }
    }
}

class comparetorMyInt implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        if (o1 > o2) {
            return -1;
        } else if (o1 == o2) {
            return 0;
        } else {
            return 1;
        }
    }
}
