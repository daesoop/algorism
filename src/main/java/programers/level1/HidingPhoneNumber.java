package programers.level1;

public class HidingPhoneNumber {
    public static void main(String[] args) {
        String phoneNum = "027778888";
        Solution1 solution1 = new Solution1();
        System.out.println(solution1.solution(phoneNum));
    }
}

class Solution1 {
    public String solution(String phone_number) {
        String[] str = phone_number.split("");
        String answer = "";
        for (int i = 0; i < str.length; i++) {
            if (str.length - i > 4) {
                answer += "*";
            }else {
                answer += str[i];
            }
        }
        return answer;
    }
}
