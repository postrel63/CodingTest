package inFlearn_kim.Main4_3;

import java.util.HashMap;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        int M = scan.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = scan.nextInt();
        }
        for (int x : Solution(N, M, arr)) {
            System.out.print(x + " ");
        }
    }

    public static int[] Solution(int N, int M, int[] arr) {

        HashMap<Integer, Integer> map = new HashMap<>();
        int[] result = new int[N - M + 1];
        for (int i = 0; i < M; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        int i = 1;
        result[0] = map.size();

        int lt = 0;
        for (int rt = M; rt < N; rt++) {
            map.put(arr[rt], map.getOrDefault(arr[rt], 0) + 1);
            if (map.get(arr[lt]) == 1) {
                map.remove(arr[lt++]);

            } else {
                map.put(arr[lt], map.get(arr[lt]) - 1);
                lt++;
            }
                result[i++] = map.size();
        }


        return result;
    }
}
