package inFlearn_kim.Main1_3;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    static String Solution(String str){
        StringTokenizer st = new StringTokenizer(str);
        String answer = "";
        int maxLen = Integer.MIN_VALUE;
        while(st.hasMoreTokens()){
            String temp= st.nextToken();
            if (temp.length() > maxLen){
                maxLen = temp.length();
                answer = temp;
            }
        }
        return answer;

        /**
         int maxLen = Integer.MIN_VALUE, pos;
         while((pos = str.indexOf(' ')!= -1){
         String temp = str.subString(0,pos);

         int len = temp.length();
         if (len > maxLen){
         maxLne = len;
         answer = temp;
         }
         str = str.subString(pos+1);
         }
         마지막 단어는 공백없이 저장되니까 반복문 안 돌아감
         반복문 마친 후에 마지막 str을 비교해주자
         if(str.length() > maxLen) answer = str;

         * **/

    }
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
        System.out.println(Solution(str));
    }
}
