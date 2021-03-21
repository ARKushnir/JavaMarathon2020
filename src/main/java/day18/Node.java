package day18;

public class Node {

    int value;
    Node right;
    Node left;

    public Node(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public void AddTo(int value, Node root) {

        if (value < root.getValue()) {
            if (root.left == null) {
                Node node = new Node(value);
                root.left = node;
            } else {
                AddTo(value, root.left);
            }
            // value == root.value
        } else if (value == root.getValue()) {
            return;
        } else {

            if (root.right == null) {
                Node node = new Node(value);
                root.right = node;
            } else {
                AddTo(value, root.right);
            }
        }
    }

    public Node DeleteNodeRec(int value, Node root){
        if (root == null) {
            return null;
        } else if (value == root.value) {
            if (root.right== null && root.left == null){
            return null;
            } else if (root.right != null && root.left != null) {
                root.left=root.left.right;
            } else if (root.right!=null && root.left==null){
               root.setValue(root.right.getValue());
               root.right=null;
            } else if (root.right==null && root.left!=null){
                root.setValue(root.left.getValue());
                root.left=null;
            }
        }
    else if (value < root.value) {
        //return DeleteNodeRec(value, root.left);
        root.left= DeleteNodeRec(value, root.left);
        return root;
    } else {
        return DeleteNodeRec(value, root.right);
        //root.right = DeleteNodeRec(value, root.right);
        //return  root;
    }
        return root;
    }


    public boolean isContainsNodeRec(int value, Node root){
        if (root == null) {
            return false;
        } else if (value == root.getValue()) {
            return true;
        } else if (value < root.getValue()) {
            return isContainsNodeRec(value, root.left);
        } else {
            return isContainsNodeRec(value, root.right);
        }
    }

    public void dfs(Node node){
        if (node == null){
            return;
        }
        dfs(node.left);
        System.out.print(" "+node.value);
        dfs(node.right);
    }
}
