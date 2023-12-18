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


        for (int i = 0; i < n; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (list[j] < list[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = list[i];
            list[i] = list[minIndex];
            list[minIndex] = temp;

        }
        return list;

    }
}
