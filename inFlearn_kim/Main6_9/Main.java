package inFlearn_kim.Main6_9;

import java.util.Arrays;
import java.util.Scanner;
//결정 알고리즘

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int M = scan.nextInt();

        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = scan.nextInt();
        }
        System.out.println(solution(N,M,arr));
    }

    private static int solution(int n, int m, int[] arr) {
        int result = 0;
        int lt = Arrays.stream(arr).max().getAsInt(); // getAsInt 형변환
        int rt = Arrays.stream(arr).sum(); // sum은 형변환 상관없음

        while (lt <= rt){
            int mid = lt + (rt - lt) / 2;

            if (count(arr,mid) <= m){
                result = mid;
                rt = mid-1;
            }else{
                lt = mid+1;
            }
        }
        return result;
    }


    public static int count(int[] arr, int capacity){
        int cnt = 1;
        int sum = 0;
        for(int x : arr){
            if(sum+x > capacity){
                cnt++;
                sum=x;
            }else{
                sum+=x;
            }
        }
        return cnt;
    }
}
