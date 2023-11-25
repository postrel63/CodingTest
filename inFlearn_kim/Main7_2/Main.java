package inFlearn_kim.Main7_2;

//재귀함수를 이용한 2진수 출력

public class Main {
    public static void main(String[] args) {

//        DFS(20);
//        int result = Fact(10);
        System.out.println("---");
        Fibo(10);

    }

    public static void DFS(int N) {
        if (N == 0) return;

        DFS(N / 2);
        System.out.print(N % 2);
    }

    public static int Fact(int N) {
        if (N == 1) return 1;

        return N * Fact(N - 1);
    }

    public static int Fibo(int N) {
        if (N == 1) return 1;
        else if (N == 2) {
            return 1;
        } else {
                    int n = Fibo(N - 2) + Fibo(N - 1);
            System.out.println(n);
            return n;
        }


    }
}
