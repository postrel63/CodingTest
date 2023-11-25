package inFlearn_kim.Main2_7;

import java.util.Scanner;

// 점수 계산 문제 0 1 0 0 1 1
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        System.out.println(solution(n, arr));

    }
    public static int solution(int n, int[] arr){
        int cnt = 0;
        int idx = 1;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) idx = 0;
            cnt += idx++;
        }



        return cnt;
    }

}
