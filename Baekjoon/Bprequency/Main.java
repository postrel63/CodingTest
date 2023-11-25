package Baekjoon.Bprequency;

import P120875.Solution;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        System.out.println(solution("staticses"));
    }

    public static int solution(String str){
        int answer;
        HashMap<Character, Integer> hm = new HashMap<>();
        for (char c : str.toCharArray()){
            hm.put(c,hm.getOrDefault(c,0)+1);
        }

        for (int i = 0 ;i< str.length(); i++){
            if (hm.get(str.charAt(i)) == 1) return i;
        }
        return -1;

    }
}




