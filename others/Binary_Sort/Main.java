package others.Binary_Sort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        sol.solution(new int[]{5, 6, 7, 8, 9});
        sol.solution(new int[]{5, 4, 3, 2, 1});
        sol.solution(new int[]{12, 5, 7, 23, 45,21,17});

    }
}

class Solution {
    public void solution(int[] nums) {

        int[][] answer = new int[nums.length][2];
        for (int i = 0; i < nums.length; i++) {
            int cnt = 0;
            int num = nums[i];
            while (num > 0) {
                cnt += num % 2;
                num = num / 2;
            }
            answer[i][0] = nums[i];
            answer[i][1] = cnt;
        }

        Arrays.sort(answer, (a,b) -> a[1] == b[1] ? a[0]- b[0] : a[1] - b[1]);
        for (int i = 0; i < answer.length; i++) {
            nums[i] = answer[i][0];
        }
        System.out.println(Arrays.toString(nums));
    }

}
