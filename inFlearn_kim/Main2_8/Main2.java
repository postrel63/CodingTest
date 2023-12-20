package inFlearn_kim.Main2_8;

import java.io.IOException;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        solution(n, arr);
    }

    public static void solution(int n, int[] arr) {
        int cnt = 1;
        int[] answer = new int[n];

        for (int i = 0; i < n; i++) {
            cnt = 1;
            for (int j = 0; j < n; j++) {
                if (arr[i] < arr[j]) {
                    cnt++;
                }
            }
                answer[i] = cnt;
                System.out.print(cnt+ " ");
        }
//        System.out.println(Arrays.toString(answer));


    }
}
