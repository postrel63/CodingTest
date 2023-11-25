package inFlearn_kim.Main1_5;

import java.util.Scanner;

public class Main {
    static String Solution(String str){
        char[] c = str.toCharArray();
        int it = 0;
        int rt = str.length()-1;
        while(it < rt){
           if (!Character.isAlphabetic(c[it])){
               it++;
           } else if (!Character.isAlphabetic(c[rt])) {
               rt--;
           }else{
               char temp = c[it];
               c[it] = c[rt];
               c[rt] = temp;
               it++;
               rt--;
           }
        }
        String answer = String.valueOf(c);
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String answer = sc.next();
        System.out.println(Solution(answer));
    }
}
