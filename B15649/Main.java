package B15649;

import java.io.*;
import java.util.StringTokenizer;

public class Main {

    static int N, M;
    static int[] list;
    static boolean[] visited;

    public static void recurs(int index) {

        if (index == M) {
            for (int i = 0; i < M; i++) {
                System.out.print(list[i] + " ");
            }
            System.out.println();
            return;
        }

        for (int i = 1; i <= N; i++) {  // 숫자 1부터 N까지 반복
            // 방문하지 않았으면 출력 배열에 담고 방문했다는 표시를 한다
            if (!visited[i]) {
                list[index] = i;
                visited[i] = true;

                // 다음번 자리에 들어갈 숫자 구하러 재귀
                recurs(index + 1);
                // 재귀 마치고 기존 반복문을 계속 이어감. 모든 자리수를 채우고 탈출 조건을 만족해서 return이 되야 아래로 진행
                visited[i] = false;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        visited = new boolean[N + 1]; // 숫자에 방문 표시니까 0번 인덱스 버리고 1번부터 체크하도록
        list = new int[M]; // 출력할 M개
        recurs(0);
    }
}
