package inFlearn_kim.Main7_4;

//피보나치 수열을 개선해가는 방법
// 재귀가 좋은가 for문이 좋은가?
// 재귀는 무조건 안좋음!! 스택  프레임 메모리 낭비

//

//public class Main {
//    public static int[] fibo;
//
//    public static void main(String[] args) {
//        int N = 10;
//        fibo = new int[N+1];
//        DFS(N);
//        for (int i = 1; i <= N; i++) {
//            System.out.print(fibo[i] + " ");
//        }
//
//    }
//
//    public static int DFS(int N) {
//        if (fibo[N] > 0) return fibo[N];
//        if (N == 1) return fibo[N] = 1;
//        else if (N == 2) return fibo[N]= 1;
//        else {
//            return fibo[N] = DFS(N - 2) + DFS(N - 1);
//        }
//
//
//    }
//
//}

public class Main{

    public static int[] fibo;
    public static void main(String[] args) {
        int n = 450;
        fibo = new int[n+1];
        DFS(n);
        System.out.println("재귀함수 사용");
        for (int i = 1; i < n; i++) System.out.print(fibo[i] + " ");
        System.out.println();
        System.out.println("DP활용");
        int[] DP = new int[n+1];
        DP[1] = 1;
        DP[2] = 1;
        System.out.print(DP[1]+" ");
        System.out.print(DP[2]+" ");
        for (int i = 3; i <= n; i++) {
            DP[i] = DP[i-2] + DP[i-1];
            System.out.print(DP[i]+" ");
        }



    }

    public  static int DFS(int n){
        //현재 배열에 값이 들어있는지 확인 후 있으면 그 값을 리턴해서 불필요한 재귀를 줄임
        // 성능 향상
        if (fibo[n] > 0) return fibo[n];


        if (n == 1) return fibo[n] = 1;
        else if (n == 2) return fibo[n] = 1;
        else {
            return fibo[n] = DFS(n-2) + DFS(n-1);
        }
    }

}