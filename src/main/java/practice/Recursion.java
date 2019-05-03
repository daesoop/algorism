package practice;

public class Recursion {
    public static void main(String[] args) {
        Test test = new Test();
//        test.practice(10);
        Test2 test2 = new Test2();
        System.out.println(test2.factorial(5));
    }
}

class Test {

    public void practice(int num) {
        if (num < 0) {
            return;
        }
        System.out.println(num);
        num--;
        practice(num);

    }
}

class Test2 {
    public int factorial(int num) {
        if (num == 1) {
            return num;
        }
        return factorial(num - 1) * num;
    }
}