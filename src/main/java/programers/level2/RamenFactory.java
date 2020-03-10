package programers.level2;

import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class RamenFactory {

    public static void main(String[] args) {
        Solution24 solution = new Solution24();
        int stock = 4;
        int[] dates = {4, 10, 15};
        int[] supplies = {20, 5, 10};
        int k = 30;
//        System.out.println(solution.solution(stock, dates, supplies, k));
        System.out.println(solution.solution2(stock, dates, supplies, k));

    }
}

class Solution24 {

    public int solution3(int stock, int[] dates, int[] supplies, int k) {
        PriorityQueue<Integer> pqSupplies = new PriorityQueue<>(new Comparator<Integer>() {

            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });

        int spIdx = 0;
        int cnt = 0;
        for (int day=0; day<k; day++) {
            if (spIdx < dates.length && day >= dates[spIdx]) {
                pqSupplies.add(supplies[spIdx]);
                spIdx++;
            }
            if (stock <= 0) {
                stock += pqSupplies.poll();
                cnt++;
            }

            stock--;
        }

        return cnt;
    }


    public int solution2(int stock, int[] dates, int[] supplies, int k) {
        int answer = 0;
        int index = 0;
        Queue<Integer> queue = new PriorityQueue<Integer>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });

        for (int i = 0; i < k; i++) {
            if (index < dates.length && dates[index] <= i) {
                queue.offer(supplies[index]);
                index++;
            }

            if (stock <= 0) {
                stock += queue.poll();
                answer++;
            }

            stock--;
        }
        return answer;
    }

    public int solution(int stock, int[] dates, int[] supplies, int k) {
        int answer = 0;
        int date = 0;
        Queue<Supply> supplyQueue = addSupplies(dates, supplies);

        for (int i = 0; i < k - 1; i++) {
            if (supplyQueue.isEmpty()) {
                return answer;
            }
            if (stock <= 0) {
                stock += supplyQueue.poll().supply;
                answer++;
            }
            if (date == supplyQueue.peek().date) {
                if (k - date < supplyQueue.peek().supply + stock) {
                    stock += supplyQueue.poll().supply;
                    answer++;
                } else {
                    supplyQueue.poll();
                }
            }
            date++;
            stock--;
        }
        return answer;
    }

    public Queue<Supply> addSupplies(int[] dates, int[] supplies) {
        Queue<Supply> supplyQueue = new PriorityQueue<Supply>();
        for (int i = 0; i < dates.length; i++) {
            supplyQueue.add(new Supply(dates[i], supplies[i]));
        }
        return supplyQueue;
    }
}

class Supply implements Comparable<Supply>{
    int date = 0;
    int supply = 0;

    public Supply(int date, int supply) {
        this.date = date;
        this.supply = supply;
    }


    @Override
    public int compareTo(Supply target) {
        if (this.date > target.date) {
            return 1;
        } else if (this.date < target.date) {
            return -1;
        }
        return 0;
    }
}