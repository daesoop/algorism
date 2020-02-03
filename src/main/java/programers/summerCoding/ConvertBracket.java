package programers.summerCoding;

public class ConvertBracket {
    public static void main(String[] args) {
        String p = "()))((()";
        Solution2 solution = new Solution2();
        System.out.println(solution.solution(p));
    }
}

class Solution2 {

    public String solution(String p) {
        String answer = "";
        String[] str = p.split("");
        answer = parse(str);
        return answer;
    }

    private String parse(String[] str) {
        int count = 0;
        int num = 0;
        boolean check = false;
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < str.length; i++) {
            if (str[i].equals("(")) {
                check = true;
                count++;
                stringBuilder.append("(");
            } else if (str[i].equals(")")) {
                if (check) {
                    stringBuilder.append(")");
                } else {
                    num++;
                }
                count--;
                check = false;
            }
            if (count == 0) {
                for (int j = 0; j < num; j++) {
                    stringBuilder.append(")");
                }
                num = 0;
            }
        }
        return stringBuilder.toString();
    }
}
