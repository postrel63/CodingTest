package inFlearn_kim.Main2_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        int[] arr2 = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        int i =0;
        while(st.hasMoreTokens()){
            arr[i] = Integer.parseInt(st.nextToken());
            i++;
        }
        st = new StringTokenizer(br.readLine());
        i =0;
        while(st.hasMoreTokens()){
            arr2[i] = Integer.parseInt(st.nextToken());
            i++;
        }
        solution(n,arr,arr2);

    }
    public static void solution(int n, int[] arr, int[] arr2){
        for (int i = 0; i < n; i++) {
            if (arr[i] - arr2[i] == 1 || arr2[i] - arr[i] == 2 ){
                System.out.println("A");
            }else if (arr[i] - arr2[i] == 2 || arr2[i] - arr[i] == 1){
                System.out.println("B");
            }else{
                System.out.println("D");
            }
        }

    }
}
