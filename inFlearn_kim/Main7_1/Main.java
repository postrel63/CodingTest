package inFlearn_kim.Main7_1;
import java.util.Scanner;
//재귀함수
//재귀함수는 스택 프레임을 사용한다.!!!
// 스택 프레임에는 매개 변수, 지역 변수, 복귀 주소를 저장함




public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        DFS(N);

    }

    public static void DFS(int N){
        if (N == 0) return;


        DFS(N-1);
        System.out.print(N +" ");

    }
}
