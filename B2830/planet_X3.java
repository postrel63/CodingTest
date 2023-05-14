package B2830;

// 자리 수가 같으면 0, 다르면 1 -> XOR 연산 (^)


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLOutput;
import java.util.*;

public class planet_X3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String p = "";
        int[][] arr = new int[20][2];
        for (int i = 0; i < n; i++) {
            p = Integer.toBinaryString(Integer.parseInt(br.readLine()));
            for (int j =0; j<p.length();j++){
                    if (p.charAt(p.length()-1-j) == '1'){
                        arr[j][1]++;
                    }else{
                        arr[j][0]++;
                    }

            }
            System.out.println(Arrays.deepToString(arr));

        }

    }


}
