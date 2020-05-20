package leetCode;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicates {

    public static void main(String[] args) {
        Solution28 solution28 = new Solution28();
        int[] nums = {1,1,1,2,2,3};
        System.out.println(solution28.removeDuplicates(nums));
    }
}

class Solution28 {
    public int removeDuplicates(int[] nums) {
        List<Integer> list = new ArrayList<>();
        if (nums.length == 0) {
            return 0;
        }
        int max = 0;
        list.add(nums[0]);
        max++;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1] ) {
                max++;
            } else if (nums[i] != nums[i - 1]) {
                max = 1;
            }
            if (max < 3) {
                list.add(nums[i]);
            }
        }
        for (int i = 0; i < list.size(); i++) {
            nums[i] = list.get(i);
        }
        return list.size();
    }
}
