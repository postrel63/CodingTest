package inFlearn_kim.Main2_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        int i =0;
        while(st.hasMoreTokens()){
            arr[i] = Integer.parseInt(st.nextToken());
            i++;
        }
        System.out.println(Solution(n,arr));

    }
    public static int Solution(int n , int[] arr){
        int max = arr[0];
        int cnt = 1;
        for (int i = 0; i < n-1; i++) {
            if (max< arr[i+1]){
                max = arr[i+1];
                cnt++;
            }
        }
        return cnt;
    }
}
