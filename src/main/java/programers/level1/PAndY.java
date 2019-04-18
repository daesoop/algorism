package programers.level1;

public class PAndY {
    public static void main(String[] args) {
        String str = "pPoooy";
        Solution10 solution = new Solution10();
        System.out.println(solution.solution(str));
    }
}
class Solution10 {
    public boolean solution(String str) {
        boolean answer = true;
        int pCount = 0;
        int yCount = 0;
        String s = str.toLowerCase();
        String[] strArr = s.split("");
        for (int i = 0; i < s.length(); i++) {
           if (strArr[i].equals("p")) {
               pCount++;
           }
           if (strArr[i].equals("y")) {
               yCount++;
           }
        }
        answer = pCount == yCount;
        return answer;
    }
}