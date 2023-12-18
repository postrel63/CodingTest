package inFlearn_kim.Main6_5;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }

        System.out.println(solution(n, arr));
    }

    private static String solution(int n, int[] arr) {
        Set<Integer> setList = new HashSet<>();
        for (int i = 0; i < n; i++) {
            setList.add(arr[i]);
        }
        if (setList.size() == n) {
            return "U";
        } else {
            return "D";
        }
    }
}
