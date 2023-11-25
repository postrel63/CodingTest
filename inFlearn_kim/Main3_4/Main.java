package inFlearn_kim.Main3_4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int M= scan.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = scan.nextInt();
        }
        System.out.println(Solution(N,M,arr));

    }
    public static int Solution(int N, int M, int[] arr){

        int lt = 0, rt = 0;
        int sum = 0;
        int count =0;

      for (rt = 0; rt < N ; rt ++ ){
          sum += arr[rt];
          if (sum == M){
              count++;
          }
          while(sum >= M){
              sum -= arr[lt++];
              if (sum == M){
                  count++;
              }
          }

      }



        return count;
    }
}
