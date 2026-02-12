package BinaryTree;

class Node{
public  int val;
public Node left;
public Node right;
//constructor for initillization
Node(int val){
    this.val=val;
    left=right=null; // initillize left , right with null
}
}

public class BinaryTreeImplementation {
    public static int idx = -1;
    public static void main(String[] args) {
  //my pre-order sequence which will reflect in tree
        int[] preOrderSequence = {1, 2, -1, -1, 3, 4, -1, -1, 5, -1, -1};
       Node ROOT = buildTree(preOrderSequence);
       preOrderSequenceDisplay(ROOT);
    }

    private static void preOrderSequenceDisplay(Node root) {
        //null-check
        if(root==null) {
            System.out.print(-1+"-->");
            return;
        }
    System.out.print(root.val+"-->");
       preOrderSequenceDisplay(root.left);
        preOrderSequenceDisplay(root.right);


    }

    private static Node buildTree(int[] preOrderSequence) {
        //here is my Recursive function
        //now, initllize the value by usuing idx
        idx++;
        if(preOrderSequence[idx]==-1) return  null; //base case
        /// According to my logic base condition should be -> when idx contains 2 value--move to right node
        Node root = new Node(preOrderSequence[idx]);
        //keep trust on the recursion
        root.left= buildTree(preOrderSequence);
        root.right=buildTree(preOrderSequence);
        return  root;
    }

}


