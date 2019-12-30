/*
    This homework problem begins our exploration of recursive functions on binary trees. To start, we’ll recursively
    count the number of nodes in the tree.

    Like many of the recursive function we’ll write, there is a small public wrapper function that simply returns the
    result of starting the recursion on the root. Your job is to complete a recursive implementation of size, which
    should return the number of nodes in tree. Create a public class called YourBinaryTree that extends BinaryTree,
    override protected int size(), and return the correct number of nodes in the tree
 */

public class YourBinaryTree extends BinaryTree {
    protected int size() {
        return size(root);
    }
    private int size(Node current) {
        if (current == null) { //if current is null, no root exists
            return 0;
        } else { // if current != null, then atleast one node exists (so start at 1)
            return 1 + size(current.left) + size(current.right);
        }
    }
}