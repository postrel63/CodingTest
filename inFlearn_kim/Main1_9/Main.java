package inFlearn_kim.Main1_9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(Solution(scan.next()));
    }

    public static int Solution(String s) {
        int result = 0;
        System.out.println("replace 방법");
//        s = s.toUpperCase().replaceAll("[A-Z]","").toString();
//        result = Integer.valueOf(s);
        System.out.println("아스키 코드 방법");
        char[] c = s.toCharArray();
//        for (char x : c){
//            if (x >= 48 && x <=57){
//                result = result*10 + (x-48);
//            }
//        }
        System.out.println("Charater.isDigits 방법 (문자(false)인지 숫자(True)인지) ");
        System.out.println(" 이 방법이 제일 좋음, 정규식은 계산 무겁고, 아스키코드 필요없음 ");
        String answer = "";
        for (char x : c){
           if (Character.isDigit(x)){
               answer += x;
           }
        }
        System.out.println(Integer.parseInt(answer));

        return result;
    }
}
