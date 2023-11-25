package inFlearn_kim.Main1_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        String input1 = in.next();
        char input2 = in.next().charAt(0); // in.next() 는 문자열. 그 문자열에서 0번 char
       int result =  solution(input1, input2);
        System.out.println(result);
    }

   public static int solution(String str, char c){
        int cnt = 0;
        c=Character.toLowerCase(c);
        for (char cha : str.toLowerCase().toCharArray()){ //새로운 문자배열
            if (cha == c) {
                cnt++;
            }
        }

        return cnt;
    }
}

