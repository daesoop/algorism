package programers.level2;

import java.util.*;

public class Printer {
    public static void main(String[] args) {
        int[] priorities = {1, 1, 9, 1, 1, 1};
        int[] priorities1 = {2,1,3,2};
        int location = 2;
        Solution11 solution11 = new Solution11();
        System.out.println(solution11.solution(priorities1, location));
    }
}

class Solution11 {

    public int solution(int[] priorities, int location) {
        int answer = 0;
        boolean boo = false;
        int lastLength = priorities.length - 1;
        List<Location> numbers = new LinkedList<>();
        for (int i = 0; i < priorities.length; i++) {
            numbers.add(new Location(priorities[i]));
        }
        numbers.get(location).bo = true;


        int i = 0;
        int out = 0;
        while (!boo) {
            int max = 0;
            Arrays.sort(priorities);
            max = priorities[lastLength];
            if (numbers.get(i).getNumber() == max && numbers.get(i).isBo() == true) {
                boo = true;
                return out + 1;
            } else if (numbers.get(i).getNumber() == max) {
                lastLength--;
                out++;
            } else if (numbers.get(i).getNumber() < max && numbers.get(i).isBo() == true) {
                numbers.add(new Location(numbers.get(i).getNumber(), true));
                numbers.remove(i);
            } else if (numbers.get(i).getNumber() < max) {
                numbers.add(new Location(numbers.get(i).getNumber()));
                numbers.remove(i);
            }
            i++;
        }
        return answer + 1;
    }
}

class Location {
    int number;
    int location;
    boolean bo = false;

    public Location(int number) {
        this.number = number;
    }

    public Location(int number, boolean bo) {
        this.number = number;
        this.bo = bo;
    }

    public int getNumber() {
        return number;
    }

    public int getLocation() {
        return location;
    }

    public boolean isBo() {
        return bo;
    }
}
