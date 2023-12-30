package inFlearn_kim.Main7_5_DFS;

/**
 * 전위 순회: 부모 - 왼쪽 자식 - 오른쪽 자식
 * 중위 순회: 왼쪽 자식 - 부모 - 오른쪽 자식
 * 후위 순회: 왼쪽 자식 - 오른쪽 자식 - 부모
 * 출력의 우선순위가 이런 것이라 생각하면 됨
 * 전위순회로 그래프를 탐색하는데 부모 먼저 출력, 왼쪽 자식으로 가서 부모 출력
 * 왼쪽 자식끝까지 탐색해서 출력, 그리고 다시 돌아가서 오른쪽 자식 출력
 * <p>
 * 중위 순회로 탐색하면
 * 루트 노드에서 왼쪽 자식이 있으니까 왼쪽으로
 * 또 왼쪽 자식이 있으면 왼쪽으로 ..
 * 쭉 내려가서 왼쪽자식이 리프노드가 되면 왼쪽 자식을 출력하고 부모 노드를 출력하고
 * 오른쪽 자식을 출력함
 * 그때 그때 상황에 맞춰서 우선순위로 보면서 해당 값이 있는지 보는 것
 * 왼쪽 자식이 있는지 보고 있으면 왼쪽 자식으로 이동
 * 또 왼쪽 자식이 있는지 보고 있으면 왼쪽 자식으로 이동
 * 리프 노드까지 가서 왼족 자식이 더 이상 없으면 출력 하고 부모로 이동해서 부모 출력
 * 오른쪽 자식으로 가서 또 왼족 자식이 있는지 확인하고 없으면 부모출력
 * ...
 *
 **/

class Node {

    int Data;
    Node2 lt, rt;

    public Node(int val) {
        Data = val;
        lt = rt = null;
    }
}

public class Main {
    Node2 root;

    public void DFS(Node2 root) {
        if (root == null) return;
        DFS(root.lt);
        DFS(root.rt);
        System.out.print(root.Data+" ");
    }


    public static void main(String[] args) {
        Main tree = new Main();
        tree.root = new Node2(1);
        tree.root.lt = new Node2(2);
        tree.root.rt = new Node2(3);
        tree.root.lt.lt = new Node2(4);
        tree.root.lt.rt = new Node2(5);
        tree.root.rt.lt = new Node2(6);
        tree.root.rt.rt = new Node2(7);
        tree.DFS(tree.root);

    }
}
