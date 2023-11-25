package others.Clinic_Robot;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(Arrays.toString(sol.solution("RRRDDDUUUUUUL", 5)));
        System.out.println(Arrays.toString(sol.solution("DDDRRRDDLL", 7)));
    }
}

class Solution {
    public int[] solution(String str, int n) {
        int[] dx = {-1, 0, 1, 0};
        int[] dy = {0, 1, 0, -1};
        int[] k = {'U', 'R', 'D', 'L'};
        int x = 0;
        int y = 0;

        for (char c : str.toCharArray()) {
            for (int i = 0; i < 4; i++) {
                if (c == k[i]) {
                    int nx = x + dx[i];
                    int ny = y + dy[i];

                    if (nx < 0 || nx >= n || ny < 0 || ny >= n) continue;

                    x = nx;
                    y = ny;
                    System.out.print(x + " ");
                    System.out.println(y);
                }
            }

        }

        return new int[]{x,y};
    }
}