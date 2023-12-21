package inFlearn_kim.Main3_1;


import java.util.ArrayList;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] list1 = new int[n];
        for (int i = 0; i < n; i++) {
            list1[i] = scan.nextInt();
        }
        int m = scan.nextInt();
        int[] list2 = new int[m];
        for (int i = 0; i < m; i++) {
            list2[i] = scan.nextInt();
        }
        for (int c : solution(list1, list2)){
            System.out.print(c + " ");
        }
        System.out.println(solution2(list1, list2));


    }

    public static int[] solution(int[] list1, int[] list2){
        int[] result = new int[list1.length + list2.length];
        int p1 = 0;
        int p2 = 0;
        int index = 0;

        while (p1 < list1.length && p2 < list2.length){
            if (list1[p1] <= list2[p2]){
                result[index++] = list1[p1++];
            }else{
                result[index++] = list2[p2++];

            }
        }
        if (p1 == list1.length){
            for (int i = p2; i < list2.length; i++) {
                result[index++] = list2[i];
            }
        }else{
            for (int i = p1; i < list1.length; i++) {
                result[index++] = list1[i];
            }
        }
        return result;
    }

    public static ArrayList<Integer> solution2(int[] list1, int[] list2){
        ArrayList<Integer> list = new ArrayList<>();
        int p1 = 0, p2 = 0;
        while ( p1 < list1.length && p2 < list2.length){
            if (list1[p1] <= list2[p2]){
                list.add(list1[p1++]);
            }else{
                list.add(list2[p2++]);
            }
        }

        while (p1 < list1.length){
            list.add(list1[p1++]);
        }
        while (p2 < list2.length){
            list.add(list2[p2++]);
        }
        return list;
    }

}
