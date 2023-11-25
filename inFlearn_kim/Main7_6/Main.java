package inFlearn_kim.Main7_6;


import java.util.Stack;


public class Main {

    public static boolean[] check;
    static int n;

    public static void main(String[] args) {

        n = 3;
        check = new boolean[n + 1];
        DFS(1);

    }

    public static void DFS(int idx) {
       if (idx == n+1){
           for (int i = 1; i < idx; i++) {
               if (check[i] == true){
                   System.out.print(i+ " ");
               }
           }
               System.out.println();
           return;
       }
       check[idx] = true;
       DFS(idx+1);
       check[idx] = false;
       DFS(idx+1);
    }

}
