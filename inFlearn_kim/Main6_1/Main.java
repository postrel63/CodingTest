package inFlearn_kim.Main6_1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = scan.nextInt();
        }
        for (int x : Solution(N,arr)){
            System.out.print(x + " ");
        }
    }
    public static int[] Solution(int N, int[] arr){

        for (int i = 0; i < N-1 ; i++){
            int index = i;
            for ( int j = i ; j < N ; j++){
                if (arr[j] < arr[index]){
                    index = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }

        return arr;
    }
}
