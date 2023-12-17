package inFlearn_kim.Main6_2;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = scan.nextInt();
        }

        for (int x : Solution(N, arr)) {
            System.out.print(x + " ");
        }
    }

    private static int[] Solution(int n, int[] arr) {


        for (int j = 0; j < n - 1; j++) {

            for (int i = 0; i < n - j - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }

        return arr;

    }
}
