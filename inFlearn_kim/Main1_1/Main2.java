package inFlearn_kim.Main1_1;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    String str = scan.next();
    char c = scan.next().charAt(0);
    System.out.println(solution(str,c));
    }

    private static int solution(String str, char c) {
        int count = 0;
        c = Character.toLowerCase(c);
        for(char ch : str.toLowerCase().toCharArray()){
            if (c == ch){
                count++;
            }
        }
        return count;
    }
}
