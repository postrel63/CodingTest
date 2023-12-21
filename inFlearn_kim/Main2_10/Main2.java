package inFlearn_kim.Main2_10;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = scan.nextInt();
            }
        }
        System.out.println(solution(n,arr));
    }
    public static int solution(int n , int[][] arr){
        int cnt = 0;
        int[] dx = {-1,0,1,0};
        int[] dy = {0,1,0,-1};
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                    boolean flag = true;
                for (int k = 0; k < 4; k++) {
                    int nx = i + dx[k];
                    int ny = j + dy[k];
                    if (nx>=0 && nx < n && ny >=0 && ny < n && arr[nx][ny] > arr[i][j]){
                        flag = false;
                        break;
                    }
                }
                if (flag){
                    cnt ++;
                }

            }
        }


//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= n; j++) {
//                if (arr[i][j-1] < arr[i][j] && arr[i][j+1] < arr[i][j] && arr[i-1][j] < arr[i][j] && arr[i+1][j] < arr[i][j]){
//                    cnt ++;
//                }
//            }
//        }
     return cnt;
    }
}
