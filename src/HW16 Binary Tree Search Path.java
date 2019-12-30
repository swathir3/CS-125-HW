/*
    This homework problem continues our exploration of recursive functions on binary trees. This time we’ll determine
    the path of values on the way to a specific value in the tree, if it exists.

    Create public class called YourBinaryTree that extends BinaryTree, override protected List pathToValue(Object value)
    This function should return a List containing all of the values (not Nodes) on the path from the root node to the
    first node with the passed value. If no node contains the passed value it should return null, but we’ve handled this
     case for you in the wrapper function. To pass the test cases you should search the right subtree of each node
     before the left subtree, since the value could exist in both trees.

    You’ll want to follow our usual guidelines for writing recursive functions:
        - Identify the base case
        - Make the problem smaller at each step
        - Combine results appropriately

    However, in this case combining results requires that you use a new data structure: official Java Lists. In Java a
    List is actually an interface type which can be implemented in multiple ways—including both using arrays and linked
    lists as discussed in class. We’ve provided a wrapper method that initializes an empty List using the ArrayList
    implementation. Java Lists provide all of the List operations we are already familiar with. You will want to use
    add(int index, Object value) to add values to the front of the list.

    Here’s an outline of how your solution should work:
        - If you’ve reached a null node, return false, since the value definitely does not exist in this (empty) tree.
        - Otherwise if this node contains the sought-after value, add yourself to the list, stop recursing, and return true.
        - Otherwise first restart the search in your right subtree. If it succeeds, this node is also part of the path, so add it to the front of the list and return true.
        - Repeat the step for your left subtree.
        - If the value that we are looking for is in neither subtree, then this node is not on the path to the value, and you should not modify the list and return false.
 */

import java.util.List;
import java.util.ArrayList;

public class YourBinaryTree extends BinaryTree {
    protected List pathToValue(Object value) {
        List path = new ArrayList();
        if (pathToValue(root, value, path) == true) {
            return path;
        } else {
            return null;
        }
    }
    private boolean pathToValue(Node current, Object value, List path) {
        if (current == null) {
            return false;
        }
        if (current.value.equals(value)) {
            path.add(0, current.value);
            return true;
        }
        if (pathToValue(current.right, value, path) || pathToValue(current.left, value, path)) {
            path.add(0, current.value);
            return true;
        }
        return false;
    }
}