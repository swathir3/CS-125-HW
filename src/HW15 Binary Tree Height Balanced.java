/*
    This homework problem continues our exploration of recursive functions on binary trees. For this problem
    you’ll determine whether a binary tree is height balanced. A tree is height balanced if the height of any node’s
    two subtrees (right and left) never differ by more than one.

    Note that you may need to solve this problem by writing two recursive functions. The first finds the height of a
    tree rooted at a particular node. The second uses this to determine if the tree rooted at that node is height
    balanced or not. Also note that as soon as you find a node where the tree is not height balanced you can stop.
    You may also find the built-in Math.max and Math.abs functions useful when completing this problem.

    As usual, create a public class called YourBinaryTree that extends BinaryTree, override protected boolean
    heightBalanced(), and implement it as described above, possibly using one or more helper functions.
 */

public class YourBinaryTree extends BinaryTree {
    public boolean heightBalanced() {
        return heightBalanced(root);
    }
    protected boolean heightBalanced(Node root) {
        int l;
        int r;
        if (root == null) {
            return true;
        }
        l = height(root.left);
        r = height(root.right);
        if (Math.abs(l - r) <= 1 && heightBalanced(root.left) && heightBalanced(root.right)) {
            return true;
        }
        return false;
    }
    public int height(Node root) {
        if (root == null) {
            return 0;
        }
        return 1 + Math.max(height(root.left), height(root.right));
    }
}