package programers.level2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindPrimeNumber {
    public static void main(String[] args) {
        String str = "17";
        Solution15 solution = new Solution15();
        solution.solution(str);
    }
}

class Solution15{
    static Set<Integer> combinationList = new HashSet<>();
    // 소수 판별하기 boolean
    public static boolean isPrimeNumber(int N){
        // 소수는 2부터 시작한다.
        //System.out.println(N);
        if(N <=1){
            return false;
        }

        // 소수가 아닐 경우 바로 return true;
        for(int i=2; i<N; i++){
            // 나눠 떨어진다는 것은 약수가 존재한다는 것.
            // 즉 소수가 아님.
            if(N%i == 0){
                return false;
            }
        }

        return true;
    }

    // [1, 2, 3]
    static void comb(int[] num, boolean[] visited, int r, String str) {
        if(r == -1){
            return;
        }


        if(isPrimeNumber(Integer.parseInt(str))){
            combinationList.add(Integer.parseInt(str));
        }

        for(int i=0; i<num.length; i++){
            if(visited[i] == false){
                visited[i] = true;
                comb(num, visited, r-1, str + String.valueOf(num[i]));
                visited[i] = false;
            }
        }

        return;
    }


    public int solution(String numbers) {
        //String으로 된 숫자배열(String type)을 int배열로 만들기.
        int[] num = new int[numbers.length()];
        boolean[] visited = new boolean[num.length];

        for(int i=0; i<numbers.length(); i++){
            num[i] = numbers.charAt(i) - '0';
        }

        // 소수의 개수
        int answer = 0;

        // 종이 조각을 붙여 소수를 몇개 만들 수 있는지
        // 소수? 자신보다 작은 수 중에서 %값이 ==0인것이 1뿐인 것.

        // num배열에서 숫자를 조합해서 여기 넣어줘야함.
        // 배열로 만들 수 있는 경우의 수



        for(int i=0; i<num.length; i++){
            visited[i] = true;
            comb(num, visited, num.length, String.valueOf(num[i]));
            visited[i] = false;
        }


        return combinationList.size();
    }
}
