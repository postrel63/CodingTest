package inFlearn_kim.Main1_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static String Solution(String s){
//        StringBuilder sb = new StringBuilder();
//        for (char c : s.toCharArray()) {
//            if (Character.isLowerCase(c)){
//                sb.append(Character.toUpperCase(c));
//            }else{
//                sb.append(Character.toLowerCase(c));
//            }
//        }
//        return sb.toString();
        String answer = "";
        for (char c : s.toCharArray()){
            // char는 정수형이라 알아서 정수로 계산
            if (c >= 97 && c <=122){
                answer += (char)(c-32);
            }else{
                answer += (char)(c+32);
            }
        }
        return answer;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String result = Solution(s);
        System.out.println(result);
    }
}
