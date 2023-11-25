package inFlearn_kim.Main1_2;

import java.util.Scanner;


public class Main2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        System.out.println(solution(str));
        System.out.println(solution2(str));
    }

    private static String solution(String str) {
        StringBuffer sb = new StringBuffer();
        for (char c : str.toCharArray()){
            if (Character.isUpperCase(c)){
               c = Character.toLowerCase(c);
            }else {
                c = Character.toUpperCase(c);
            }
           sb.append(c);
        }

        return sb.toString();
    }
    private static String solution2(String str){
        String result = "";
        for (char c : str.toCharArray()){
            if (c >= 97 && c <= 122){
                result += (char)(c-32);
            }else{
                result += (char)(c+32);
            }
        }
        return result;
    }
}
