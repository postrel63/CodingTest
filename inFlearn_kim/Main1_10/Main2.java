package inFlearn_kim.Main1_10;

import java.io.IOException;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        char c = scan.next().charAt(0);

        for (int i : solution(str, c)) {
            System.out.print(i + " ");
        }
    }

    // Integer.MAX_VALUE  로 하니까 범위를 초과한다.
    // 그래서 범위보다 살짝 큰 1000으로 지정했는데 이게 옳은 방법인진 모르겠으나 제대로 동작함

    private static int[] solution(String str, char c) {
        int count = 1000;
        int[] result = new int[str.length()];


        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c) {
                count = 0;
            } else {
                count++;
            }
            result[i] = count;
        }
        count = 1000;

        for (int i = str.length() -1 ; i >= 0; i--) {
            if (str.charAt(i) == c) {
                count = 0;
            } else {
                count++;
            }
            if (result[i] > count) {
                result[i] = count;
            }
        }
        return result;
    }
}
