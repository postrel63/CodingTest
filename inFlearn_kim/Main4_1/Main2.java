package inFlearn_kim.Main4_1;

import java.util.HashMap;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);
        int N = scan.nextInt();
        String str = scan.next();
        System.out.println(Solution(N, str));

    }
    public static char Solution(int N, String str){
        HashMap<Character, Integer> map = new HashMap<>();
        int answer = Integer.MIN_VALUE;
        char result = 0;

        for (char c : str.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }

        System.out.println(map.remove('C')); //삭제하고 value 값 반환

        for (char c : map.keySet()){
            if (map.get(c) > answer){
                answer = map.get(c);
                result = c;
            }
        }


        return result;
    }
}
