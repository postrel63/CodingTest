package inFlearn_kim.Main1_12;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        String str = scan.next();
        System.out.println(solution(num, str));
    }

    private static String solution(int num, String str) {
        StringBuilder result = new StringBuilder();
        int count = 0;
        StringBuilder sb = new StringBuilder();

        for (char x : str.toCharArray()) {
            if (x == '#') {
                sb.append(1);
            } else {
                sb.append(0);
            }
        }

        /*
       0   0-6
       1   7-13
       2   14-20
       3   21-27
         */

        for (int i = 0; i < num; i++) {
            String substring = sb.substring(i * 7, (i + 1) * 7);
            result.append(toBinary(substring));
        }
        return result.toString();
    }
    private static char toBinary(String substring) {
        int num = Integer.parseInt(substring, 2);
        return (char) num;

    }

}
