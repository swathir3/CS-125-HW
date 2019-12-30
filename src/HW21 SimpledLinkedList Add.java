/*
    In this homework problem you’ll continue your implementation of a SimpleList that uses a linked list of Item
    objects internally. We’ve provided some starter code in a class called SimpleLinkedList. get and set work, along
    with the special case of add to the front of the list. (In code provided to you.) Your job is to finish the general
    case of add to any valid index.

    You should create a class called YourSimpleLinkedList that inherits from SimpleLinkedList and provide a complete
    implementation of add. add returns void regardless of whether the index is valid or not. If the index is invalid it
    does not alter the list. You may want to look at the implementation of getItem in SimpleLinkedList for a reminder
    of how to walk a linked list using a for loop. We have provided a constructor for YourSimpleLinkedList that takes
    an array of Object references and simply passes them to a call to super to properly initialize SimpleLinkedList.

    Note that we have altered the way that the list maintains the size. Instead of walking the entire list, add
    (and eventually remove) maintain currentSize properly. You will also need to do this as you complete add.
 */

public class YourSimpleLinkedList extends SimpleLinkedList {
    YourSimpleLinkedList(Object[] values) {
        super(values);
    }

    public void add(int index, Object toAdd) {
        if (index == 0) {
            start = new Item(toAdd, start);
            currentSize++;
            return;
        } else {
            int count = 0;
            for (Item current = start; current != null; current = current.next) {
                if (count == index - 1) {
                    current.next = new Item(toAdd, current.next);
                    currentSize++;
                    break;
                } else {
                    count++;
                }
            }
        }
        // Other cases for you to finish
    }
}