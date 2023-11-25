package inFlearn_kim.Main4_3;
;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int N = scan.nextInt();
    int M = scan.nextInt();
    int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = scan.nextInt();
        }
        for (int x: Solution(N,M,arr)){
            System.out.print(x+" ");
        }
    }

    public static int[] Solution(int N, int M, int[] arr){
        int[] result = new int[N-M+1];
//        HashSet<Integer> set = new HashSet<>(M);
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < N - M + 1; i++) {
            for (int j = i; j < i+M; j++) {
//                set.add(arr[j]);
                map.put(arr[j],1);
            }
//            result[i] = set.size();
//            set.clear();
            result[i] = map.size();
            map.clear();

        }
        return result;
    }
}
