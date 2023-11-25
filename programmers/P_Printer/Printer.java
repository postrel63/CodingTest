package programmers.P_Printer;


import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        Queue q = new LinkedList();
        int target = priorities[location];
        int count = 0;


        for (int i = 0; i < priorities.length; i++) {
            char num = (char) ('A' + i);
            q.offer(num);
        }
//        System.out.println(q.element());






        return answer;
    }
}

public class Printer {
    public static void main(String[] args) {
        Solution sol = new Solution();
        sol.solution(new int[]{2, 1, 3, 2}, 2);


    }
}
