package dataStructure;

import java.io.*;

public class Stack {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Methods stack = new Methods();
        int size = Integer.parseInt(br.readLine());

        for (int i = 0; i < size; i++) {
            String[] str = br.readLine().split(" ");
            if (str[0].equals("push")) {
                stack.push(Integer.parseInt(str[1]));
            } else if (str[0].equals("pop")) {
                int result = stack.pop();
                bw.write(String.valueOf(result));
                bw.newLine();
            } else if (str[0].equals("size")) {
                bw.write(String.valueOf(stack.size()));
                bw.newLine();
            } else if (str[0].equals("empty")) {
                bw.write(String.valueOf(stack.empty()));
                bw.newLine();
            } else if (str[0].equals("top")) {
                bw.write(String.valueOf(stack.top()));
                bw.newLine();
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}

class Methods {
    private int[] num = new int[10000];
    private int size = 0;

    public void push(int x) {
        num[size] = x;
        size++;
    }

    public int pop() {
        if (size == 0) {
            return  -1;
        }
        size--;
        int tmp = num[size];
        num[size] = 0;
        return tmp;
    }

    public int size() {
        return size;
    }

    public int empty() {
        if (size == 0) {
            return 1;
        } else {
            return 0;
        }
    }

    public int top() {
        if (size == 0) {
            return -1;
        }
        return num[size -1];
    }
}
