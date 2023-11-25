package others.PhateEven;

import java.util.ArrayList;

class Solution {
    public int[] solution(int n) {
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList();
        for (int i =1; i<=n;i++){
            if (i%2==1){
                list.add(i);
            }
        }

        // 프로그래머스 짝수는 싫어요. 배열로 반환문제. 굳이 리스트 -> 배열 안해도 되나봄
        answer = new int[list.size()];
        for (int i = 0; i<list.size();i++){
            answer[i]=list.get(i);
        }


        return answer;
    }
}

public class Main {
    public static void main(String[] args){

        Solution sol = new Solution();
        sol.solution(15);


    }
}
