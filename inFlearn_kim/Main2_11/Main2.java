package inFlearn_kim.Main2_11;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[][] list = new int[n + 1][6];
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= 5; j++) {
                list[i][j] = scan.nextInt();
            }
        }
        System.out.println(solution(n, list));
    }

    public static int solution(int n, int[][] list) {

        int maxCount = Integer.MIN_VALUE;
        int answer = 0;
        int c;
        int count;
        for (int k = 1; k <= n; k++) {
            count = 0;
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= 5; j++) {
                    if (list[i][j] == list[k][j]) {
                        count++;
                        break;
                    }
                }
            }
            if (count > maxCount) {
                maxCount = count;
                answer = k;
            }
        }


        return answer;
    }
}
