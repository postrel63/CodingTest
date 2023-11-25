package Baekjoon.B10807;

import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;


// 백준 개수 세기
public class Main {
    static int Hash_num = 17;

    public static void main(String[] args) throws IOException {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        HashMap<Integer, Integer> map = new HashMap();
        for (int i =0; i<n; i++){
            int num = scan.nextInt();
            map.put( num ,map.getOrDefault(num,0)+1);
        }
        int k = scan.nextInt();
        int answer = 0;
        if (map.containsKey(k)){
            answer = map.get(k);
            System.out.println(answer);
        }
    }

}