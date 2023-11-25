package inFlearn_kim.Main2_9;

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

        System.out.println(solution(n, arr));

    }
    public static int solution(int n, int[][] arr){
        int result = -1;
        int sum,sum2,sum3,sum4;
        for (int i = 0; i < n; i++) {
            sum = 0;
            sum2 = 0;
            sum3 = 0;
            sum4 = 0;
            for (int j = 0; j < n; j++) {
                sum+=arr[i][j];
                sum2 += arr[j][i];
                //대각선은 한번만 하면 되니까 2중포문안에 같이 쓰기보단
                // 새로 포문 만드는 게 낫긴 함
                sum3 += arr[j][j];
                sum4 += arr[n-1-j][j];
                if (sum > result){
                    result = sum;
                }
                if (sum2 > result){
                    result = sum2;
                }
                if (sum3 > result){
                    result = sum3;
                }
                if (sum4 > result){
                    result = sum4;
                }
            }
        }


        return result;

    }

}
