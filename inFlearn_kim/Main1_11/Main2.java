package inFlearn_kim.Main1_11;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        System.out.println(Solution(str));
    }

    private static String Solution(String str) {
        int count = 1;
        str += " ";
        char[] strList = str.toCharArray();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length() -1; i++) {
            if (strList[i] == strList[i + 1]) {
                count++;
            } else {
                    sb.append(strList[i]);
                if (count > 1) {
                    sb.append(count);
                }
                count = 1;
            }

        }


        return sb.toString();
    }
}
