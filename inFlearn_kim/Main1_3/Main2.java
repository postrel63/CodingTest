package inFlearn_kim.Main1_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        System.out.println(solution(st));
    }

    private static String solution(StringTokenizer str) {
        int count = Integer.MIN_VALUE;
        String result = "";

        while (str.hasMoreTokens()){
            String s = str.nextToken();
            if (s.length() > count){
                count = s.length();
                result = s;
            }
        }
        return result;
    }
}
