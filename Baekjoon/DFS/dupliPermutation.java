package Baekjoon.DFS;

import java.util.*;
class dupliPermutation{
    static int n, m;
    static int[] pm;
    public void DFS(int L){
        System.out.println("?1?");
        if(L == m){
            for(int x : pm) System.out.print(x+" ");
            System.out.println();
        }
        else{
            for(int i = 1; i <= n; i++){
                pm[L] = i;
                DFS(L+1);
            }
        }
    }
    public static void main(String[] args){
        System.out.println("??");
        dupliPermutation T = new dupliPermutation();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        m = kb.nextInt();
        pm = new int[m];
        T.DFS(0);
    }
}
