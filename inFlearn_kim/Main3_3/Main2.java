package inFlearn_kim.Main3_3;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int M = scan.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = scan.nextInt();
        }

        System.out.println(Solution(N,M,arr));

    }

    public static int Solution(int N, int M, int[] arr){
        int window = 0, maxSum = 0;

        for (int i = 0; i < M; i++) {
            window+= arr[i];
        }
        maxSum = window;

        for (int i = 0; i < N-M; i++) {
            window-=arr[i];
            window+=arr[i+M];
            if (maxSum < window){
                maxSum = window;
            }

        }


        return maxSum;
    }
}
