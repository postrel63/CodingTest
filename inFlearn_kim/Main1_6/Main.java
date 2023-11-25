package inFlearn_kim.Main1_6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
        static String Solution(String str){
            String answer = "";
            for (int i = 0; i < str.length(); i++) {
                if (str.indexOf(str.charAt(i)) == i){
                    answer += str.charAt(i);
                }
            }
            return answer;
        }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        System.out.println(Solution(str));
    }
}
