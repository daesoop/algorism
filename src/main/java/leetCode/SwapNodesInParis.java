package leetCode;

public class SwapNodesInParis {
    public static void main(String[] args) {
        Solution9 solution = new Solution9();
        ListNode1 listNode = new ListNode1(1);
        ListNode1 listNode2 = new ListNode1(2);
        ListNode1 listNode3 = new ListNode1(3);
        ListNode1 listNode4 = new ListNode1(4);
        listNode.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        System.out.println(solution.swapPairs(listNode).val);
        System.out.println(solution.swapPairs(listNode2).val);
        System.out.println(solution.swapPairs(listNode3).val);
        System.out.println(solution.swapPairs(listNode4).val);
    }
}

class Solution9 {
    public ListNode1 swapPairs(ListNode1 head) {
        if (head == null || head.next == null) return head;

        ListNode1 n1 = head;
        ListNode1 n2 = head.next;

        n1.next = n2.next;
        n2.next = n1;

        n1.next = swapPairs(n1.next);

        return n2;
    }
}

// * Definition for singly-linked list.
class ListNode1 {
    int val;
    ListNode1 next;

    ListNode1(int x) {
        val = x;
    }
}
