package inFlearn_kim.Main2_12;

import java.util.Arrays;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int[][] list = new int[m][n];
        for (int j = 0; j < m; j++) {
            for (int i = 0; i < n; i++) {
                list[j][i] = scan.nextInt();
            }
        }

        System.out.println(solution(n, m, list));

    }

    public static int solution(int n, int m, int[][] list) {
        int pairCount = 0;
        int result = 0;
        int[] check = new int[n+1];

        // 1번학생이 멘토가 되는 횟수
        // 2번학생이 ..
        // 최대 20명이니까 일일이 계산


        for (int k = 1; k <= n; k++) {
            Arrays.fill(check, 1);
            check[0] = 0;
            pairCount =0;
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {

                    if (list[i][j] == k) {
                        check[list[i][j]] = 0;
                        break;
                    } else {

                        //k 학생의 멘티가 될 수 없는 학생들 0로 바꾸기
                        check[list[i][j]] = 0;

                    }

                }
            }
            for (int i = 0; i < n; i++) {
                if (check[i] == 1){
                    pairCount++;
                }
            }
            result += pairCount;
        }


        return result;
    }

}
