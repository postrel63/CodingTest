package inFlearn_kim.Main2_2;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int[] list = new int[num];
        for (int i = 0; i < num; i++) {
            list[i] = scan.nextInt();
        }
        System.out.println(solution(num, list));
    }

    private static Integer solution(int num, int[] list) {
        int maxTall = Integer.MIN_VALUE;
        int count = 0;
        for (int i = 0; i < num; i++) {
            if (list[i] > maxTall) {
                count++;
                maxTall = list[i];
            }
        }
        return count;
    }
}
