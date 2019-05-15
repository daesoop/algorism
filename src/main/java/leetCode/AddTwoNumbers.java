package leetCode;

import java.util.ArrayList;
import java.util.List;

public class AddTwoNumbers {
    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode listNode1 = new ListNode(234);
        ListNode listNode2 = new ListNode(564);
        solution.solution(listNode1, listNode2);
    }
}
class Solution{
    public void solution(ListNode listNode1, ListNode listNode2) {

    }
}

class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
 }