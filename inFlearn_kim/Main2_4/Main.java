package inFlearn_kim.Main2_4;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for (int a : solution(n)) System.out.print(a + " ");
    }
    public static int[] solution(int n){
        ArrayList<Integer> list = new ArrayList<>();
//        // 다이나믹 프로그래밍
//        int[] arr = new int[n+1];
//        arr[1] = 1;
//        arr[2] = 1;
//        list.add(1);
//        list.add(1);
//        for (int i = 3; i <= n; i++) {
//            arr[i] = arr[i-1]+arr[i-2];
//            list.add(arr[i]);
//        }
        // 조건문으로만
        int[] arr =new int[n];
        int a = 1;
        int b = 1;
        arr[0] = 1;
        arr[1] = 1;
        for (int i = 2; i < n; i++) {
            int temp = a+b;
            a = b;
            b = temp;
            arr[i] = b;
        }
        return arr;
    }
}
