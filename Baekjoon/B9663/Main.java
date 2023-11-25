package Baekjoon.B9663;

import java.util.Scanner;


public class Main {
    static int n;
    static int[] gird = new int[n];
    static int cnt = 0;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        gird = new int[n];
        System.out.println(nQueen(0));
    }
    public static int nQueen(int row){
        if (row == n){
            cnt ++;
            return cnt;
        }

        for (int i = 0; i < n; i++) {
            gird[row] = i;
            if (check(row)){
                nQueen(row+1);
            }
        }

    return cnt;
    }

    public static boolean check(int row){
        for (int i = 0; i < row; i++) {
            if (gird[i]==gird[row] ||row -i == Math.abs(gird[row] - gird[i])){
                return false;
            }
        }
    return true;
    }

}

