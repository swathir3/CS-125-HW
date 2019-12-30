/*
    Let’s do another binary tree problem! For this problem you’ll implement equals to determine if a tree is equal to
    another tree. For two trees to be equal they must have the same values in the same positions.

    public class BinaryTree {
        protected class Node {
            protected Object value;
            protected Node right;
            protected Node left;
            Node(Object setValue) {
                value = setValue;
            }
        }
        protected Node root;
        // Remainder omitted for brevity
    }
    As usual, create a public class called YourBinaryTree that extends BinaryTree, override public boolean
    equals(Object other), and implement it as described above. If other is null or not a BinaryTree you should
    return false. As a reminder you can access protected BinaryTree instance variables in equals, including on other,
    which you will need to do to start the recursion on other.
 */

public class YourBinaryTree extends BinaryTree {
    public boolean equals(Object other) {
        if (other == null || (!(other instanceof BinaryTree))) {
            return false;
        }
        BinaryTree otherTree = (BinaryTree) other;
        return equals(root, otherTree.root);
    }
    private boolean equals(Node one, Node two) {
        if (one == null && two == null) {
            return true;
        } else if (one == null || two == null) {
            return false;
        } else if (!(one.value.equals(two.value))) {
            return false;
        } else if (equals(one.left, two.left) && equals(one.right, two.right)) {
            return true;
        }
        return false;
    }
}