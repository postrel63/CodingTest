package inFlearn_kim.Main1_4;

import java.util.ArrayList;
import java.util.Scanner;

public class Main2 {
    static ArrayList<String> Solution(int n, String[] str) {
        ArrayList<String> list = new ArrayList<>();
        for (String s : str){
          char[] c = s.toCharArray();
          int it = 0, rt = s.length()-1;
          while(it < rt){
              char temp = c[it];
              c[it] = c[rt];
              c[rt] = temp;
              it++;
              rt--;
          }
          String temp = String.valueOf(c);
          //valueOf는 스태딕 메서드. 즉 객체 없이 그냥 String. 하고 쓸 수 있음
          list.add(temp);
        }

        return list;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] str = new String[n];
        for (int i = 0; i < n; i++) {
            str[i] = sc.next();
        }

        for (String s : Solution(n, str)) {
            System.out.println(s);
        }


    }
}
