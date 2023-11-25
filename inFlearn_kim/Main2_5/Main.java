package inFlearn_kim.Main2_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        System.out.println(solution(n));
    }
    public static int solution(int n){
        int[] arr = new int[n+1];
        Arrays.fill(arr,1);
//        for (int i = 2; i <= n; i++) {
//            arr[i] = 1;
//        }
        arr[0] = 0;
        arr[1] = 0;
        for (int i = 2; i <= Math.sqrt(n); i++) {

            if (arr[i] == 0)continue;

            int temp = i * 2;
            while (temp <= n){
                arr[temp] = 0;
                temp += i ;
            }

        }
        int result = Arrays.stream(arr).sum();

        return result;
    }
}
