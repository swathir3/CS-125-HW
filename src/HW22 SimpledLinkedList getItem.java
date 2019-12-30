/*
    In this homework problem we’ll begin completing an implementation of SimpleList that uses a linked list of Item
    objects internally. We’ve provided some starter code in a class called SimpleLinkedList. However, the get and set
    methods rely on a helper function called getItem to work properly, which is not properly implemented yet.

    You should create a class called YourSimpleLinkedList that inherits from SimpleLinkedList and provide a correct
    implementation of getItem. getItem should return a reference to the Item at that position in the list, or null if
    no such item exists. You may want to look at the implementation of size in SimpleLinkedList for a reminder of how
    to walk a linked list using a for loop. You will also need to provide a constructor for YourSimpleLinkedList that
    takes an array of Object references and simply passes them to a call to super to properly initialize
    SimpleLinkedList.
 */

public class YourSimpleLinkedList extends SimpleLinkedList {
    YourSimpleLinkedList(Object[] elements) {
        super(elements);
    }
    public Item getItem(int index) {
        Item current = start;
        int count = 0;
        while (current != null) {
            if (count == index) {
                return current;
            }
            count++;
            current = current.next;
        }
        return null;
    }
}