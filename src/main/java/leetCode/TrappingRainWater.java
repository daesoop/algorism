package leetCode;

import java.util.ArrayList;
import java.util.List;

public class TrappingRainWater {
    public static void main(String[] args) {
        Solution19 solution = new Solution19();
        int[] height = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        System.out.println(solution.trap(height));
    }
}

class Solution19 {
    public int trap(int[] height) {
        int l, r, lmax = 0, rmax = 0, s = 0;
        l = 0;
        r = height.length - 1;

        while (l < r) {
            if (height[l] < height[r]) {
                if (height[l] > lmax)
                    lmax = height[l];
                else
                    s += lmax - height[l];
                l++;
            } else if (height[r] <= height[l]) {
                if (height[r] > rmax)
                    rmax = height[r];
                else
                    s += rmax - height[r];
                r--;
            }
        }
        return s;
    }

}
