package others.DFS;

import java.util.*;
// 재귀함수로 DFS 구현
public class DFS_recursion {
    static final int maxNum = 10;
    static int N, E;
    static int[][] Graph = new int[maxNum][maxNum];
    static boolean[] visited = new boolean[maxNum];

    static void dfs(int node) {
        visited[node] = true;
        System.out.print(node + " ");

        for (int i = 0; i < E; i++) {
            if (!visited[i] && Graph[node][i] != 0){
                dfs(i);
            }
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        E = sc.nextInt();

        for (int i = 0; i < E; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            Graph[u][v] = Graph[v][u] = 1;
        }
        dfs(0);
    }


}
