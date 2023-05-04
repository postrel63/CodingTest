package B2167;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[][] arr = new int[N][M];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int K = Integer.parseInt(br.readLine());
        System.out.println(K);
        for (int a = 0; a < K; a++) {
            String temp = br.readLine();
            System.out.println(temp);
            st = new StringTokenizer(temp);
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            System.out.println(Solution(N, M, arr, i, j, x, y));
        }
    }

    public static int Solution(int N, int M, int[][] arr, int i, int j, int x, int y) {
        int answer = 0;

        for (int k = i; k <= x; k++) {
            for (int l = 0; l < arr[0].length; l++) {
                answer += arr[k-1][l];
            }
        }
        for (int k = 0; k < j - 1; k++) {
            answer -= arr[i-1][k];
        }
        for (int k = M - 1; k > y - 1; k--) {
            answer -= arr[x-1][k];
        }
        return answer;
    }

}
