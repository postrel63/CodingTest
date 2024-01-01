package inFlearn_kim.Main7_8;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    int answer = 0;
    int[] dist = {-1, 1, 5};
    int[] ch;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int S = scan.nextInt();
        int E = scan.nextInt();
        Main T = new Main();
        System.out.println(T.solution(S,E));
    }

    public int solution(int s, int e) {
        Queue<Integer> q = new LinkedList<>();
        ch = new int[10001];
        ch[s] = 1;
        q.offer(s);
        int count = 0;
        while(!q.isEmpty()){
            int len = q.size();
            for (int i = 0; i < len; i++) {
               int x =  q.poll();
               if (x == e){
                   return count++;
               }
                for (int j = 0; j < 3; j++) {
                    int index = x+dist[j];
                    if (index >= 1 && index <= 10000 && ch[index] != 1){
                            ch[index] = 1;
                            q.offer(index);
                    }
                }
            }
            count++;
        }

        return 0;
    }
}
