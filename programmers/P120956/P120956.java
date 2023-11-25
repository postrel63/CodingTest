package programmers.P120956;

import java.util.Arrays;

public class P120956 {
    public static void main(String[] args) {
        String[] babbling ={"aya", "yee", "u", "maa", "wyeoo"};
        int cnt = 0;
        String[] pn = {"aya", "ye", "woo", "ma"};

       for (int i =0; i< babbling.length; i++){
           for (int j =0; j < pn.length; j++){
               babbling[i] =babbling[i].replace(pn[j], "0");
           }
           babbling[i] = babbling[i].replace("0","");
           if (("").equals(babbling[i])){
               cnt++;
           }
       }

        System.out.println(Arrays.toString(babbling));
        System.out.println(cnt);



    }
}
