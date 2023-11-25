package others.PsameNumber;

import java.util.*;

class Solution {
    public int[] solution(int []arr) {
        int[] answer = {};
        int cnt = 0;

        Stack<Integer> st = new Stack();

        for (int i: arr){
            if (st.isEmpty() || st.peek() != i){
                st.push(i);
            }
        }
        answer = new int[st.size()];
        for (int i = answer.length-1; i>=0 ; i--){
            answer[i] = st.pop();
        }


        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        for (int i :answer){
            System.out.println(i);
        }
        return answer;
    }
}

public class Main {
    public static void main(String[] args){

        Solution sol = new Solution();
        sol.solution(new int[]{1,1,3,3,0,1,1});


    }
}
