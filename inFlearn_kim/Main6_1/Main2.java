package inFlearn_kim.Main6_1;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] list = new int[n];
        for (int i = 0; i < n; i++) {
            list[i] = scan.nextInt();
        }

        for (int x : solution(n, list)) {
            System.out.print(x + " ");
        }
    }

    private static int[] solution(int n, int[] list) {

        int minNumber = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (minNumber > list[j]) {
                    minNumber = list[i];
                }
            }
            int temp = list[i];
            list[i] = minNumber;
            minNumber = temp;

        }
        return list;

    }
}
