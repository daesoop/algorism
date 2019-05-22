package programers.test;

public class Test1 {
    public static void main(String[] args) {
        Soltion soltion = new Soltion();
        int[] arr = {1,0,1,1,0,1,1,0};
        System.out.println(soltion.solution(arr));
    }
}

class Soltion{
    public int solution(int[] arr) {
        int answer = 0;
        int sequence = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                sequence++;
                answer += (i + 1) * sequence;
                System.out.println("i : " + answer);
            } else if (arr[i] == 0) {
                sequence = 0;
            }
        }
        return answer;
    }
}
