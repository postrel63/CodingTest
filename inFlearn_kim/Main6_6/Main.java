package inFlearn_kim.Main6_6;

import java.util.ArrayList;
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

        for (int x : Solution(N, arr)) {
            System.out.print(x + " ");
        }
        System.out.println("--");

        for (int x : Solution1(N, arr)) {
            System.out.print(x + " ");
        }

    }

    public static ArrayList<Integer> Solution1(int n, int[] arr) {
        int[] temp = arr.clone();
        Arrays.sort(temp);
        ArrayList<Integer> answer = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (arr[i] != temp[i]) {
                answer.add(i + 1);
            }

        }


        return answer;
    }

    public static ArrayList<Integer> Solution(int N, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        for (int i = 0; i < N - 1; i++) {
            if (arr[i] >= arr[i + 1]) {
                if (answer.isEmpty()) {
                    answer.add(i + 1);
                } else {
                    answer.add(i + 2);
                }
            }
        }


        return answer;
    }
}
