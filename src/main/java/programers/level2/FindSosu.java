package programers.level2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindSosu {
    public static void main(String[] args) {
        Solution21 solution = new Solution21();
        String number = "17";
        System.out.println(solution.solution(number));
    }
}

class Solution21 {

    public static boolean[] prime() {
        boolean[] primes = new boolean[10000000];
        primes[0] = primes[1] = true;
        for(int i = 2; i < primes.length; i++) {
            if(!primes[i]) {
                for(int j = 2; j * i < primes.length; j++) {
                    primes[j * i] = true;
                }
            }
        }

        return primes;
    }

    public static int solution(String numbers) {
        int answer = 0;
        int[] arr = new int[numbers.length()];
        for(int i = 0; i < arr.length; i++) {
            System.out.println("aaa" + numbers.charAt(i));
            arr[i] = numbers.charAt(i) - '0';
            System.out.println("bbb" + arr[i]);
        }

        Set<Integer> set = new HashSet<>();
        for(int i = 1; i <= arr.length; i++)
            permutation(set, arr, 0, i);

        boolean[] primes = prime();
        for(int num : set) {
            answer = primes[num] ? answer : answer + 1;
        }
        return answer;
    }

    public static void permutation(Set<Integer> set, int[] arr, int index, int r){
        if(index == r){
            set.add(createInteger(arr, r));
            System.out.println("index : " + index);
            System.out.println("r : " + r);
        } else {
            for(int i = 0; i + index < arr.length; i++){
                swap(arr, index, index + i);
                System.out.println();
                System.out.println();
                permutation(set, arr, index + 1, r);
                swap(arr, index, index + i);
            }
        }
    }

    public static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static int createInteger(int[] arr, int r) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < r; i++)
            sb.append(arr[i]);
        System.out.println();
        return Integer.parseInt(sb.toString());
    }
}


//    private List<Integer> parse(String number) {
//        List<Integer> list = new ArrayList<>();
//        String[] strArr = number.split("");
//        int num;
//
//        for (int i = 0; i < strArr.length; i++) {
//            num = Integer.parseInt(strArr[i]);
//            list.add(num);
//        }
//
//        return list;
//    }
//
//    private Set<Integer> addNums(List<Integer> list) {
//        Set<Integer> set = new HashSet<>();
//
//
//        return set;
//    }
//}

