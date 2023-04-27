package B1158_Josephus;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Josephus {
    public static void main(String[] args) throws IOException {

        // 1<=k<=n<=5000
        // N명, K번째 사람 제거
        // K 삭제 후 k가 첫 번째가 될 수 있도록

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        LinkedList<Integer> list = new LinkedList<>();


        for (int i = 1; i <= n; i++) {
            list.add(i);
        }
        sb.append("<");

        while (list.size() > 1) {
            for (int i = 0; i < k - 1; i++) {
                int val = list.poll();
                list.offer(val);

            }
            int val = list.poll();
            sb.append(val).append(", ");
        }
        sb.append(list.poll()).append(">");
        System.out.println(sb);


    }
}
