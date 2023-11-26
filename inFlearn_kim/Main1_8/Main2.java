package inFlearn_kim.Main1_8;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        System.out.println(solution(str));
    }

    private static String solution(String str) {
        str = str.toUpperCase().replaceAll("[^A-Z]", "");
        String newStr = new StringBuilder(str).reverse().toString();
        if (str.equals(newStr)) {
            return "YES";
        } else {
            return "NO";
        }
    }
}
