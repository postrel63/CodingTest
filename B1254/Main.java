package B1254;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        Deque<Character> dq = new ArrayDeque<>();
        int cnt = 0;
        for (char c : str.toCharArray()) {
            dq.addFirst(c);
        }

        while (!dq.isEmpty()) {
            char temp = dq.removeLast();
            if (dq.isEmpty()) {
                cnt += 1;
                break;
            }
            if (temp == dq.peek()) {
                dq.removeFirst();
            }
            cnt += 2;
        }

        System.out.println(cnt);
    }
}
