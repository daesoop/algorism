package programers.level2;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class PassTrucks {
    public static void main(String[] args) {
        int bridge_length = 2;
        int weight = 10;
        int[] truck_weight = {7, 4, 5, 6};
        Solution5 solution5 = new Solution5();
        solution5.solution(bridge_length, weight, truck_weight);
    }
}

class Solution5 {

    public int solution(int bridge_length, int weight, int[] truck_weight) {
        List<Truck> trucks = new ArrayList<>();
        Queue<Truck> trucksQue = new LinkedList<>();
        int time = 0;
        int sum = 0;

        for (int i = 0; i < truck_weight.length; i++) {
            trucksQue.offer(new Truck(truck_weight[i] , 0));
        }

        System.out.println(trucksQue.peek().weight + sum);

        while (!(trucksQue.isEmpty() && trucks.isEmpty())) {
            if (!trucks.isEmpty() && trucks.get(0).length == bridge_length) {
                sum -= trucks.get(0).weight;
                trucks.remove(0);
            }
            if (!trucksQue.isEmpty() && trucksQue.peek().weight + sum <= weight ) {
                sum += trucksQue.peek().weight;
                trucks.add(trucksQue.poll());
            }
            for (int i = 0; i < trucks.size(); i++) {
                trucks.get(i).length++;
            }
            time++;
        }
        return time;
    }
}

class Truck {
    int weight;
    int length;
    boolean bo = true;

    public Truck(int weight, int length) {
        this.weight = weight;
        this.length = length;
    }

}

//if (!queue.isEmpty()) {
//        if (sum + queue.peek() <= weight) {
//            trucks.add(new Truck(queue.poll(), 0));
//        }
//    }
//            for (int i = 0; i < trucks.size(); i++) {
//        if (trucks.get(i).length == bridge_length) {
//            sum -= trucks.get(i).length;
//            trucks.get(i).bo = false;
//        }
//        trucks.get(i).plus();
//    }
//            System.out.println(time);
//    time++;
//}