package programmers.P120875;

import java.util.Arrays;

public class Solution {
    public static int solution(int[][] dots){
        int answer = 0;
        int cnt = 0;
        System.out.println(Arrays.deepToString(dots));
        System.out.println(dots[0][1]);
        long mid = (dots[1][1] - dots[0][1]) / (dots[1][0] -dots[0][0]);
        System.out.println(mid);



        return answer;
    }



    public static void main(String[] args) {

//        int[][] dots = {{x1,y1}, {x2, y2}, {x3, y3}, {x4, y4}};
        int[][] dots = {{1,4}, {9, 2}, {3, 8}, {11, 6}};
        int result = Solution.solution(dots);

    }


}
