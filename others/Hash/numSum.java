package others.Hash;

import java.util.Arrays;
import java.util.HashMap;

public class numSum {
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(Arrays.toString(sol.solution(new int[]{7, 3, 2, 13, 9, 15, 8, 11})));
    }
}

class Solution{
    public int[] solution(int[] arr){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int c : arr){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        return null;
    }
}