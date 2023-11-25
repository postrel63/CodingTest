package inFlearn_kim.Main1_4;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<String> Solution(int n, String[] str) {
        ArrayList<String> list = new ArrayList<>();
        for (String s : str) {
            // String 은 수정할때 새로운 객체가 계속 생성되는데 StringBuilder는 하나로 다 해결
            String temp = new StringBuilder(s).reverse().toString();
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
/**
 * String answer = "";
 * Deque<Character> dq = new LinkedList<>();
 * for (char c : str.toCharArray()){
 * dq.addLast(c);
 * }
 * while(!dq.isEmpty()){
 * answer += dq.removeLast();
 * }
 * return answer;
 * <p>
 *
 * for (int i = 0; i<n ; i++){
 * String str = sc.next();
 * System.out.println(Solution(str));
 * }
 **/
