package inFlearn_kim.Main1_10;


import java.util.Scanner;

/**
 한 개의 문자열 s와 문자 t가 주어지면
 문자열 s의 각 문자가 문자 t와 떨어진 최소거리를 출력하는 프로그램을 작성하세요.

 teachermode e
 1 0 1 2 1 0 1 2 2 1 0

 0번 인덱스부터 1을 넣어가며 e를 만나면 0을 넣고 다시 1부터 시작
 마지막 인덱스부터 똑같이 진행하는데 더 작으면 교체하는 형식
 -> 문자열 길이가 짧으니까 괜찮지 않을까?
 --> 맞음

 * **/
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        char c = scan.next().charAt(0);
        for(int x : dist(str, c)){
            System.out.print(x+" ");
        }



    }

    public static int[] dist(String str, char c){
        int[] arr = new int[str.length()];
        int idx = 1000;

       for(int i =0; i<str.length() ; i++){
           if (str.charAt(i) ==c){
               idx = 0;
               arr[i] = idx;
           }else{
               idx++;
               arr[i] = idx;
           }
       }

        idx = 1000;
        for(int j = str.length()-1; j >= 0; j--){
           if (str.charAt(j) ==c){
               idx = 0;
           }else {
               idx++;
               if (idx < arr[j]){
                   arr[j] = idx;
               }
           }
       }


       return arr;
    }

}

