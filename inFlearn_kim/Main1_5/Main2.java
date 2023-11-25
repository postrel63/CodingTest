package inFlearn_kim.Main1_5;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        //특정 문자 뒤집기. 영어 알파벳만 뒤집고 나머진 그대로
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        System.out.println(solution(str));

    }

    private static String solution(String str) {
        int len = str.length();
        char[] ch = str.toCharArray();
        int lt = 0, rt = len - 1;

        while (lt < rt) {

            if (!Character.isAlphabetic(ch[lt])) {
                lt++;
            } else if (!Character.isAlphabetic(ch[rt])) {
                rt--;
            } else {
                char temp = ch[lt];
                ch[lt] = ch[rt];
                ch[rt] = temp;
                lt++;
                rt--;
            }
        }
        return String.valueOf(ch);
    }
}
