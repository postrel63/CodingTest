package programmers.P81301;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringNum {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String answer = br.readLine();
        String[] wordList ={"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        for (int i = 0; i < wordList.length; i++) {
            answer = answer.replace(wordList[i],Integer.toString(i));
        }

        int a = Integer.parseInt(answer);
        System.out.println(answer);

    }
}
