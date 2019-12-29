/*
    Create a public class called YourBinaryTree that extends BinaryTree.
    Override protected Map<Object, Integer> valueCount() and have it return a Map mapping each object in the tree to the
    number of times that it appears. If the tree is empty (root is null) you should return an empty Map.

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
}
*/

import java.util.Map;
import java.util.HashMap;
public class YourBinaryTree extends BinaryTree {
    protected Map<Object, Integer> valueCount() {
        Map<Object, Integer> result = new HashMap<Object, Integer>();
        if (root == null) {
            return result;
        }
        valueCount(root, result);
        return result;
    }
    private void valueCount(Node current, Map<Object, Integer> map) {
        if (current == null) {
            return;
        }
        int count = map.getOrDefault(current.value, 0);
        map.put(current.value, count + 1);
        valueCount(current.right, map);
        valueCount(current.left, map);
    }
}