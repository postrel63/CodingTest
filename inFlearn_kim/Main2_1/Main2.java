package inFlearn_kim.Main2_1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int[] list = new int[num];
        for (int i = 0; i < num; i++) {
            list[i] = scan.nextInt();
        }
        for (int x : solution(num, list)) {
            System.out.print(x + " ");
        }
    }

    private static ArrayList<Integer> solution(int num, int[] list) {
        ArrayList<Integer> result = new ArrayList<>();
        result.add(list[0]);
        for (int i = 0; i < num - 1; i++) {
            if (list[i] < list[i + 1]) {
                result.add(list[i + 1]);
            }
        }
        return result;
    }
}
