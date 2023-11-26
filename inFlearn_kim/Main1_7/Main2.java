package inFlearn_kim.Main1_7;

import java.util.Scanner;
//회문 문자열
// 투포인터, StringBuilder 사용해서 reverse, for문으로 절반까지

public class Main2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        System.out.println(solution(str.toLowerCase()));
    }

    private static String solution(String str) {
        int lt = 0, rt = str.length() - 1;
        while (lt < rt) {
            if (str.charAt(lt) != str.charAt(rt)) {
                return "NO";
            } else {
            }
            lt++;
            rt--;
        }
        return "YES";
    }


}
