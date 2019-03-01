package dataStructure;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Queue {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());
        Method q = new Method();

        for (int i = 0; i < size; i++) {
            String order[] = br.readLine().split(" ");

            if (order[0].equals("push")) {
                int n = Integer.parseInt(order[1]);
                q.push(n);
            } else if (order[0].equals("front")) {
                q.front();
            } else if (order[0].equals("back")) {
                q.back();
            } else if (order[0].equals("size")) {
                q.size();
            } else if(order[0].equals("empty")) {
                q.empty();
            } else if (order[0].equals("pop")) {
                q.pop();
            }
        }
    }
}
class Method {
    private int front;
    private int back;
    private int size;
    private int[] arr = new int[10001];

    public void push(int x) {
        arr[back] = x;
        back++;
    }

    public void pop() {
        if (back - front == 0) {
            System.out.println(-1);
        } else {

            System.out.println(arr[front]);
            arr[front] = 0;
            front++;
        }

    }

    public void size() {
        size = back - front;
        System.out.println(size);
    }

    public void empty() {
        if (back - front == 0) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }

    public void front() {
        if (back - front == 0) {
            System.out.println(-1);
        } else {
            System.out.println(arr[front]);
        }
    }

    public void back() {

        if (back - front == 0) {
            System.out.println(-1);
        } else {
            System.out.println(arr[back-1]);
        }
    }

    public void print(){
        System.out.println(Arrays.toString(arr));
    }

}
