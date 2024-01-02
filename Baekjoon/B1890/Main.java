package Baekjoon.B1890;

import com.sun.prism.shader.Solid_LinearGradient_PAD_AlphaTest_Loader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;
        int[][] arr= new int[N][N];
        for (int i = 0 ; i< N ; i++){
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        System.out.println(Solution(arr,N));
    }
    public static int Solution(int[][] arr, int N){
        int result = 0;

        int[][] arr2 = new int[N][N];

        int rl = 0;
        int dw = 0;

        for (int i = 0 ; i< N*2; i++){


        }



        return result;
    }

}
