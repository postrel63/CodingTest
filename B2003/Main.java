package B2003;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {
   public static int Solution(int M, int[] str){
       if (str == null || str.length == 0){
           return 0;
       }
       int sum = 0;
       int S = 0;
       int E = 0;
       int cnt = 0;

     while (true){
         if (sum >= M) {
             sum -= str[S++];
         } else if (E == str.length) {
             break;
         }else {
             sum += str[E++];
         }
         if (sum == M) {
             cnt++;
         }
     }
       return cnt;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int[] arr = new int[N];
        for (int i =0 ; i < N ; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        System.out.println(Solution(M,arr));

    }
}
