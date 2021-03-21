package day18;

public class Task3 {
    public static void main(String[] args) {
        Node root = new Node (6);

        root.AddTo(4, root);
        root.AddTo(8,root);
        root.AddTo(3,root);
        root.AddTo(5,root);
        root.AddTo(7,root);
        root.AddTo(9,root);
        root.AddTo(1,root);
        //root.AddTo(2,root);
        root.AddTo(10,root);
        root.AddTo(25,root);

   /*     if (root.isContainsNodeRec(6,root)) {
            System.out.println("Founded 6");
        }

        if (!root.isContainsNodeRec(7,root)){
            System.out.println("Not Founded 7");
        };

        if (root.isContainsNodeRec(8,root)){
            System.out.println("Founded 8");
        };

        if(!root.isContainsNodeRec(9,root)){
            System.out.println("Not Founded 9");
        }; */


        root.dfs(root);
        System.out.println();
        root.DeleteNodeRec(3, root);
        root.dfs(root);
    }

}
