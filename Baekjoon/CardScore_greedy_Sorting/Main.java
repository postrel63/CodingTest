package Baekjoon.CardScore_greedy_Sorting;

public class Main {
    public static void main(String[] args) {

        Solution sol = new Solution();
        System.out.println(sol.solution(new int[]{2, 3, 7, 1, 2, 1, 5}, 4));
        System.out.println(sol.solution(new int[]{1,2,3,5,6,7,1,3,9}, 5));
        System.out.println(sol.solution(new int[]{1,30,3,5,6,7}, 3));
        System.out.println(sol.solution(new int[]{1,2,15,3,6,7,8,9}, 5));
    }
}

class Solution {
    public int solution(int[] nums, int k) {
//        슬라이딩 윈도우를 활용한 양쪽 끝값 채택 문제
//        total 을 구한 뒤 슬라이딩 윈도우 값이 최소인 값을 빼주자

        int windowSize = nums.length - k;
        int windowValue = 0;
        int total = 0;
        int minValue = 0;

        for (int n : nums){
            total += n;
        }

        for (int i = 0; i < windowSize; i++) {
            windowValue += nums[i];
            minValue = windowValue;
        }

        for (int i = 0; i < nums.length-windowSize; i++) {
            windowValue = windowValue - nums[i] + nums[i+windowSize];
             minValue = Math.min(windowValue,minValue);
        }
        return total - minValue;

    }
}
