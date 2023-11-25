package inFlearn_kim.Main1_11;

import java.util.Scanner;

/**
 * 알파벳 대문자로 이루어진 문자열을 입력받아 같은 문자가 연속으로 반복되는 경우
 * 반복되는 문자 바로 오른쪽에 반복 횟수를 표기하는 방법으로
 * 문자열을 압축하는 프로그램을 작성하시오.
 * KKHSSSSSSSE
 * K2HS7E
 * check 변수에 문자를 저장하고
 * 문자가 변하면 cnt와 함께 출력
 * 마지막 문자는 그냥 출력하는데 cnt > 1 이면 cnt 도 출력
 * <p>
 * 강의 방법
 * i 와 i +1 비교
 * 마지막엔 '' 빈 문자열 한 개 넣어놓고 비교
 **/

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        System.out.println(zip(str));
    }

    public static String zip(String str) {
        String answer = "";
        str = str + " ";
        int cnt = 1;

        char[] arr = str.toCharArray();
        for (int i = 0; i < str.length()-1; i++) {
            if (arr[i] == arr[i+1]){
                cnt++;
            }else{
                answer = answer + arr[i];
                if (cnt > 1){
                    answer += String.valueOf(cnt);
                }
                cnt = 1;
            }
        }


//        StringBuilder sb = new StringBuilder();
//        int cnt = 0;
//        char check = str.charAt(0);
//        int i = 0;
//        for (char c : str.toCharArray()) {
//            if (c != check) {
//                sb.append(check);
//                if (cnt != 1) {
//                    sb.append(cnt);
//                }
//                check = c;
//                cnt = 0;
//            }
//            cnt++;
//            i++;
//        }
//        if (cnt > 1) {
//            sb.append(check).append(cnt);
//        }else{
//            sb.append(check);
//        }

        return answer;
    }
}
