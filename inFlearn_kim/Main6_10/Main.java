package inFlearn_kim.Main6_10;


import java.util.Arrays;
import java.util.Scanner;

//마구간 정하기
public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int C = scan.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = scan.nextInt();
        }
        System.out.println(solution(N,C,arr));

    }

    // 1 2 4 8 9
    // 거리를 기준으로 이진탐색해야할까
    private static int solution(int n, int c, int[] arr) {
        int result = 0;
        Arrays.sort(arr);
        int lt = 1;
        int rt = arr[n-1] - arr[0];

        while(lt <= rt){
            int mid = lt + (rt - lt) / 2;

            if (count(arr, mid) >= c){
                result = mid;
                lt = mid + 1;
            }else{
                rt = mid -1;
            }
        }
        return result;
    }

    private static int count(int[] arr, int mid) {
        int count = 1;
        int index = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] - index >= mid){
                count++;
                index = arr[i];
            }
        }
        return count;
    }
}
