package inFlearn_kim.Main1_7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static String Solution(String str){
        String answer = "YES";
        for (int i = 0; i < str.length()/2; i++) {
            if (str.charAt(i) != str.charAt(str.length()-i-1)){
                return "NO";
//                answer = "NO";
//                break;
            }
        }

        return answer;
    }

    static String Solution2(String str){
        String answer = "YES";
        StringBuilder sb = new StringBuilder(str);
        String s = new StringBuilder(str).reverse().toString();
        // !str.equals(sb.reverse()) 하면 string과 sb비교니까 안돼
        // sb.reverse().toString() 해주든
        // 위처럼 string s 으로 받아서 하든 해야해
        if (!str.equalsIgnoreCase(s)){ // 대소문자 무시
            return "NO";
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String T = br.readLine();
        System.out.println(Solution(T.toLowerCase()));
        System.out.println(Solution2(T.toLowerCase()));
    }
}
