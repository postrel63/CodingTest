package others.DFS;

import org.w3c.dom.Node;

import java.util.Scanner;
import java.util.Stack;

public class DFS_Stack {
    static final int maxNum = 10;
    static int N, E;
    static int[][] Graph = new int[maxNum][maxNum];

    static void dfs(int node) {
        //방문 확인 배열
        boolean[] visited = new boolean[maxNum];
        //스택을 활용해서 dfs
        Stack<Integer> stack = new Stack<>();
        // 스택에 0번 노드 넣기
        stack.push(node);

        // 스택이 비어있지 않다면 꺼내서 cur에 저장
        while (!stack.isEmpty()) {
            int cur = stack.pop();

            //만약 방문한 적 있으면 루프 continue;
            if (visited[cur])
                continue;

            //꺼낸 노드 방문 체크 후 출력
            visited[cur] = true;
            System.out.print(cur + " ");

            //노드의 개수만큼 반복문 돌림
            // 인접노드이면서 방문한 적이 없으면 스택에 push
            for (int i = 0; i < N; ++i) {
                if (!visited[i] && Graph[cur][i] != 0) {
                    stack.push(i);
                }
            }

        }


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //노드 개수 N
        N = sc.nextInt();
        //간선 개수 E
        E = sc.nextInt();

        //간선이 있으면 1을 양방향으로 연결
        for (int i = 0; i < E; ++i) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            Graph[u][v] = Graph[u][v] = 1;
        }
        //0번 노드부터 dfs 시작
        dfs(0);
    }
}
