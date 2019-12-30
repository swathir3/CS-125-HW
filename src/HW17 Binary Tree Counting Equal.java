/*
    This homework problem continues our exploration of recursive functions on binary trees. This time we’ll count the
    number of nodes in the tree where that node’s value is equal to either the value of its right child or its left child.

    Create a public class called YourBinaryTree that extends BinaryTree, override protected int
    countEqualToEitherChild(), and return the count as described above. A portion of the BinaryTree class that you are
    extending is shown below for reference.
        - Follow our usual guidelines for writing recursive functions:
        - Identify the base case
        - Make the problem smaller at each step
        - Combine results appropriately

    Note that—as usual—you will want countEqualToEitherChild to act as a wrapper and call a private method private int
    countEqualToEitherChild(Node current) that starts the recursion on the root node. Note also that the nodes in the
    tree are Objects and so you should test for equality appropriately.
 */

public class YourBinaryTree extends BinaryTree {
    protected int countEqualToEitherChild() {
        return countEqualToEitherChild(root);
    }
    private int countEqualToEitherChild(Node current) {
        int count = 0;
        if (current == null) {
            return 0;
        }
        if (current.left != null && current.left.value.equals(current.value)) {
            count = 1;
        }
        if (current.right != null && current.right.value.equals(current.value)) {
            count = 1;
        }
        return count + countEqualToEitherChild(current.right)
                + countEqualToEitherChild(current.left);
    }
}