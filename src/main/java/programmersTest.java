public class programmersTest {
    public static void main(String[] args) {
        int[] a = {1,2,3,4};
        int[]b = {1,1,7};
        Solution solution = new Solution();
        System.out.println(solution.solution(a,b));
    }
}
class Solution {
    public int solution(int[] people, int[] tshirts) {
        int answer = 0;
        boolean bo = false;
        for (int i = 0; i < people.length; i++) {
            for (int j = 0; j < tshirts.length; j++) {
                if (people[i] <= tshirts[j] ) {
                    tshirts[j] = -1;
                    answer ++;
                    break;
                }
            }
        }
        return answer;
    }
}
