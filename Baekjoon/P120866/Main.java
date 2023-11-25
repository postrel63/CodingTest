package Baekjoon.P120866;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
   Solution sol = new Solution();
        System.out.println(Arrays.toString(sol.solution(new String[]{"OSO", "OOO", "OXO","OOO"}, new String[]{"E 2", "S 3", "W 1"})));

    }
}
class Solution {
    public int[] solution(String[] park, String[] routes) {
        int[] answer = {};
        int[] dx = {-1,0,1,0};
        int[] dy = {0,1,0,-1};
        int[] k = {'N','E','S','W'};
        int x = 0;
        int y = 0;
        for(int a = 0; a < park.length ; a++){
            for(int b = 0; b < park[0].length() ; b++){
                if(park[a].charAt(b) == 'S'){
                    x = a;
                    y = b;
                    break;
                }

            }
        }
        System.out.println(x+","+y);

        for(String str : routes){
            char op = str.charAt(0);
            int n = Integer.parseInt(String.valueOf(str.charAt(2)));
            System.out.println(op+"--"+n);
            int nx = 0;
            int ny = 0;
            boolean flag = true;
            for(int i = 0; i < 4; i ++){
                if(op == k[i]){
                     nx = x;
                     ny = y;

                    for(int j = 0; j < n ; j++){
                        nx = nx + dx[i];
                        ny = ny + dy[i];
                        if (nx < 0 || nx >= park.length || ny < 0 || ny >= park[0].length()||park[nx].charAt(ny) == 'X'){
                            flag = false; break;
                        }
                    }
                }
            }
        if (flag == false) continue;
        x = nx;
        y = ny;

        }
        return new int[]{x,y};
    }
}