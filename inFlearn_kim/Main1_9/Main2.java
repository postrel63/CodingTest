package inFlearn_kim.Main1_9;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    String str = scan.next();
        System.out.println(solution(str));

    }

    private static int solution(String str) {
        StringBuilder sb = new StringBuilder();
        for (char c : str.toCharArray()){
            if (Character.isDigit(c)){
                sb.append(c);
            }
        }
        return Integer.parseInt(sb.toString());
    }
}
