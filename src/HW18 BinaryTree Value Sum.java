/*
    This homework problem continues our exploration of recursive functions on binary trees. This time we’ll sum the
    values in binary tree.

    Create a public class called YourBinaryTree that extends BinaryTree, override protected int sum(), and return the
    sum of the values of the nodes in the tree, which will all be Integers. A portion of the BinaryTree class that
    you are extending is shown below for reference.

    Note that you will want sum to act as a wrapper and call a private method private int sum(Node current) that starts
    the recursion on the root node. Also note that because your tree stores Objects, you will need to apply a cast to
    the value to include it in a sum.
 */

public class YourBinaryTree extends BinaryTree {
    protected int sum() {
        return sum(root);
    }
    private int sum(Node current) {
        if (current == null) {
            return 0;
        } else {
            return sum(current.right) + sum(current.left) + (Integer) current.value;
        }
    }
}