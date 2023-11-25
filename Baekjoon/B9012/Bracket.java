package Baekjoon.B9012;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

class CheakVPS {
    CheakVPS() {
    }

    public String CVPS(String str) {

        StringTokenizer st = new StringTokenizer(str, "");
        Stack stack = new Stack();

        String ArrayStr[] = str.split("");
        for (int i = 0; i < ArrayStr.length; i++) {

            if (stack.isEmpty() || stack.peek().equals(ArrayStr[i])) {
                stack.push(ArrayStr[i]);

            } else {
                if ("(".equals(stack.peek()) && ")".equals(ArrayStr[i])) {
                    stack.pop();
                }
            }
        }

        if (stack.isEmpty()) {
            return "YES";
        } else {
            return "NO";
        }
    }
}


public class Bracket {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        CheakVPS vps = new CheakVPS();


        for (int i = 0; i < n; i++) {
            String str = br.readLine();
           String answer = vps.CVPS(str);
           sb.append(answer+"\n");
        }
        System.out.println(sb.toString());
    }
}
