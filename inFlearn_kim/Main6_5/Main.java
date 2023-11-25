package inFlearn_kim.Main6_5;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = scan.nextInt();
        }

        System.out.println(Solution(N, arr));
        System.out.println(Solution1(N,arr));
    }

    //정렬로 중복확인
    private static String Solution1(int n, int[] arr) {

        Arrays.sort(arr);
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] == arr[i+1]){
                return "D";
            }
        }
        return "U";

    }

    //배열 , map 으로 중복확인
    private static String Solution(int N, int[] arr) {
        int[] answer = new int[10000000];
        for (int x : arr) {
            if (answer[x] == 0) {
                answer[x] = 1;
            } else {
                return "D";
            }
        }
        return "U";
    }


}
