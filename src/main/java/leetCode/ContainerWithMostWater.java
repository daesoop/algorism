package leetCode;

public class ContainerWithMostWater {
    public static void main(String[] args) {
        Solution13 solution = new Solution13();
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        int[] height2 = {1, 1};
        System.out.println(solution.solution(height));
    }
}

class Solution13 {

    public int solution(int[] height) {
        int max = 0;

        for (int i = 0; i < height.length - 1; i++) {
            for (int j = i; j < height.length; j++) {
                int h = 0;
                if (height[i] < height[j]) {
                    h = height[i];
                } else {
                    h = height[j];
                }

                if (max < h * (j - i)) {
                    max = h * (j - i);
                }
            }
        }

        return max;
    }
}