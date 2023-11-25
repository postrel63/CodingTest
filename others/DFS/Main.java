package others.DFS;

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        sol.DFS(1);
    }
}

class Solution{
    public void DFS(int v){

        if (v > 7){
            return;
        }else{

            System.out.println(v + " ");
            DFS(v*2);
            DFS(v*2+1);
        }
    }
}