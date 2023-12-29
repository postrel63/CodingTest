
class Node {

    int Data;
    Node lt, rt;

    public Node(int val) {
        Data = val;
        lt = rt = null;
    }
}

public class Main2 {
    Node root;

    public void DFS(Node root) {
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
