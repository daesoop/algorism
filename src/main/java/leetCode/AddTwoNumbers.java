package leetCode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class AddTwoNumbers {
    public static void main(String[] args) {
        Solution solution = new Solution();
        List<Integer> listNode1 = new LinkedList<>();
        List<Integer> listNode2 = new LinkedList<>();

        listNode1.add(2);
        listNode1.add(4);
        listNode1.add(3);

        listNode2.add(5);
        listNode2.add(6);
        listNode2.add(4);

//        ListNode listNode1 = new ListNode(234);
//        ListNode listNode2 = new ListNode(564);
        solution.solution(listNode1, listNode2);
    }
}
class Solution{

    public void solution(List<Integer> listNode1, List<Integer> listNode2) {
        String node1 = "";
        String node2 = "";
        int sum = 0;

        for (int i = listNode1.size() - 1; i >= 0; i--) {
            node1 += String.valueOf(listNode1.get(i));
        }
        for (int i = listNode2.size() - 1; i >= 0; i--) {
            node2 += String.valueOf(listNode2.get(i));
        }

        sum = convertString(node1, node2);
    }

    private int convertString(String node1, String node2) {
        return Integer.valueOf(node1) + Integer.valueOf(node2);
    }
}

class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
 }