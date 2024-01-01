package inFlearn_kim.Main7_5_DFS;

class Node2 {

    int Data;
    Node2 lt, rt;

    public Node2(int val) {
        Data = val;
        lt = rt = null;
    }
}

public class Main2 {
    Node2 root;

    public void DFS(Node2 root) {
        if (root == null) return;
        DFS(root.lt);
        DFS(root.rt);
        System.out.print(root.Data+" ");
    }


    public static void main(String[] args) {
        Main tree = new Main();
        tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);
        tree.root.rt.lt = new Node(6);
        tree.root.rt.rt = new Node(7);
        tree.DFS(tree.root);

    }
}
