package others.Line_greedy;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.solution(12, new int[][]{{5, 10}, {1, 8}, {0, 2}, {0, 3}, {2, 5}, {2, 6}, {10, 12}, {7, 12}}));
    }
}

class Solution{
    public int solution(int m, int[][] arr){
        System.out.println("aa");

        //출발 지점 오름차순, 끝점 오름차순.. 왜 안되는지 고민
        int answer = 0;
        Arrays.sort(arr, (a,b) ->a[0]- b[0]);
        int i = 0;
        int start = 0;
        int end = 0;
        while(i < arr.length){
            while(i < arr.length && arr[i][0] <= start){
                end = Math.max(end, arr[i][1]);
                i++;
            }
            answer++;
            if (end == m){
                return answer;
            }
            start = end;
        }
        System.out.println(":aa");
        return answer;
    }

}
