package inFlearn_kim.Main2_1;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 큰 수 출력하기
 N개의 정수를 입력받아, 자신의 바로 앞 수보다 큰 수만 출력하는 프로그램을 작성하세요.
 **/

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n+1];
        arr[0] = Integer.MIN_VALUE;
        for (int i = 1; i <= n; i++) {
            arr[i] = scan.nextInt();
        }

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (arr[i]> arr[i-1]){
                list.add(arr[i]);
                System.out.print(arr[i]+" ");
            }
        }
        System.out.println(list);

    }
}
