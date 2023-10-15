import java.util.ArrayList;

public class bstToBbst {
    class Node {
        int data;
        Node right, left;
        Node(int item) {
            data = item;
            left = right = null;
        }
    }

    Node buildBalancedTree(Node root) {
        //Add your code here.
        //first inorder traversal on BST to get all nodes in sorted order, then
        //select middle node as root and recursively add left as mid-1 and right as mid+1;
        ArrayList<Node> list = new ArrayList<>();
        inorder(list, root);
        return bbst(list, 0, list.size()-1);
    }

    private Node bbst(ArrayList<Node> list, int l, int r) {
        if (l > r) return null;

        int mid = (l + r) / 2;
        Node root = list.get(mid);
        root.left = bbst(list, l, mid);
        root.right = bbst(list, mid+1, r);

        return root;
    }

    private void inorder(ArrayList<Node> list, Node root) {
        if (root == null) return;

        inorder(list, root.left);
        list.add(root);
        inorder(list, root.right);
    }
}
