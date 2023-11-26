package inFlearn_kim.Main1_6;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = scan.next();

        System.out.println(solution(str));
        System.out.println(solution2(str));
    }

    private static String solution(String str) {

        // O(n^2) 시간 복잡도
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            if (str.indexOf(str.charAt(i)) == i) {
                result += str.charAt(i);
            }
        }
        return result;
    }

    private static String solution2(String str) {
        // set 사용
        Set<String> set = new HashSet<>();
        StringBuilder sb = new StringBuilder();

        for (char x : str.toCharArray()) {
            if (!set.contains(String.valueOf(x))) {
                set.add(String.valueOf(x));
                sb.append(x);
            }
        }
        return sb.toString();
    }
}
