package inFlearn_kim.Main3_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
        }

        int m = scan.nextInt();
        int[] b = new int[m];
        for (int i = 0; i < m; i++) {
            b[i] = scan.nextInt();
        }

        for (int x : solution(a, b)){
            System.out.print(x+" ");
        }

    }

    public static ArrayList<Integer> solution(int[] a, int[] b){
        ArrayList<Integer> list = new ArrayList<>();
        int p1 = 0, p2 = 0;
        Arrays.sort(a);
        Arrays.sort(b);
        while (p1 < a.length && p2 < b.length){
            if (a[p1] < b[p2]){
                p1++;
            }else if (a[p1] > b[p2]){
                p2++;
            }else{
                list.add(a[p1]);
                p1++;
                p2++;
            }
        }
        return list;
    }
}
