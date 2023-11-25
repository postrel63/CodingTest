package Baekjoon.P42578;


import java.util.HashMap;
import java.util.Iterator;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        HashMap<String, Integer> map = new HashMap<>();
        for (String[] s : clothes) {
            String str = s[1];
            map.put(str, map.getOrDefault(str, 0) +1);
        }
        Iterator<Integer> it = map.values().iterator();
        while (it.hasNext()){
            answer *= it.next().intValue()+1;
        }
        return answer-1;
    }


    public static void main(String[] args) {
        String[][] closets = {{"yellow_hat", "headgear"},
                {"blue_sunglasses", "eyewear"},
                {"green_turban", "headgear"}};
        Solution sol = new Solution();
        int result = sol.solution(closets);
        System.out.println(result);
    }
}