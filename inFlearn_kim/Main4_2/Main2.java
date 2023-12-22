package inFlearn_kim.Main4_2;

import java.util.HashMap;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String a = scan.next();
    String b = scan.next();
        System.out.println(Solution(a, b));
    }
    public static String Solution(String a, String b){
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        for (char c : a.toCharArray()){
            map1.put(c, map1.getOrDefault(c,0)+1);
        }

        for (char c : b.toCharArray()){
            if (map1.containsKey(c) && map1.get(c) > 0){
                map1.put(c,map1.get(c)-1);
            }else{
                return "NO";
            }
//            map2.put(c, map2.getOrDefault(c,0)+1);
        }


//
//        if (map1.equals(map2)){
//            return "YES";
//        }

        return "YES";
    }
}
