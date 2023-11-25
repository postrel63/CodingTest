package inFlearn_kim.Main1_4;

import java.util.ArrayList;
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String[] list = new String[n];
        for (int i = 0 ; i < n ; i++){
            list[i] = scan.next();
        }
        for (String x : solution(n, list)){
            System.out.println(x);
        }
        for (String x : solution2(n, list)){
            System.out.println(x);
        }
    }

    private static ArrayList<String> solution(int n, String[] list) {
        ArrayList<String> result = new ArrayList<>();

        for (String x : list){
            String s = new StringBuilder(x).reverse().toString();
            result.add(s);
        }

        return result;
    }

    private static ArrayList<String> solution2(int n, String[] list){

        ArrayList<String> result = new ArrayList<>();

        for (String x : list){
            char[] c = x.toCharArray();
            int lp = 0, rp = x.length() - 1;
            char temp = 0;
            while (lp < rp){
               temp = c[lp];
                c[lp] = c[rp];
                c[rp] = temp;
                lp ++;
                rp --;
            }
            result.add(String.valueOf(c));
        }
        return result;
    }
}
