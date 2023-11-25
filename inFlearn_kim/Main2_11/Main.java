package inFlearn_kim.Main2_11;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = scan.nextInt();
            }
        }

        System.out.println(soulution(n, arr));
    }

    public static int soulution(int n, int[][] arr) {
        int result = 0;
        int maxcnt = 0;
        int cnt = 0;
        int temp = 0;
        for (int k = 0; k < n; k++) {
            cnt = 0;
            for (int i = 0; i < n; i++) {
                temp = arr[k][i];
                for (int j = 0; j < n; j++) {
                    if (arr[j][i] == temp) {
                        cnt++;
                    }
                }
            }
            if (maxcnt < cnt){
                maxcnt = cnt;
                result = k;
            }

        }
        return result+1;
    }
}
