package inFlearn_kim.Main6_6;

import java.util.ArrayList;
import java.util.Scanner;

/*
같은 키의 사람이 여러명 있으면 찾기 힘듬
복사 후 정렬 방식이 가장 좋아보임
 */

public class Main2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            arr[i] = scan.nextInt();
        }

        for (int x : solution(num, arr)) {
            System.out.print(x + " ");
        }
    }

    private static ArrayList<Integer> solution(int num, int[] arr) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < num - 1; i++) {

            if (arr[i] > arr[i + 1]) {
                if (result.size() == 0) {
                    result.add(i + 1);
                } else {
                    result.add(i + 2);
                }
            }
        }

        return result;
    }
}
