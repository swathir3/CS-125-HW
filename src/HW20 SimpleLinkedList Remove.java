/*
    In this homework problem you’ll complete an implementation of a SimpleList that uses a linked list of Item objects
    internally. We’ve provided some starter code in a class called SimpleLinkedList. get, set, add, and size work.
    Your job is to finish the SimpleList interface by completing remove.

    You should create a class called YourSimpleLinkedList that inherits from SimpleLinkedList and provide a complete
    implementation of remove. If the index is valid remove returns a reference to the Object that was removed.
    Otherwise it returns null and does not alter the list. You may want to look at the implementation of getItem in
    SimpleLinkedList for a reminder of how to walk a linked list using a for loop. We have provided a constructor for
    YourSimpleLinkedList that takes an array of Object references and simply passes them to a call to super to properly
    initialize SimpleLinkedList.

    Note that we have altered the way that the list maintains the size. Instead of walking the entire list, add and
    remove should maintain currentSize properly. You will also need to do this as you complete remove.
 */

public class YourSimpleLinkedList extends SimpleLinkedList {
    YourSimpleLinkedList(Object[] values) {
        super(values);
    }
    public Object remove(int index) {
        if (index < 0 || index > this.size() - 1) {
            return null;
        } else if (index == 0) {
            Object toReturn = this.getItem(0).value;
            start = this.getItem(1);
            currentSize--;
            return toReturn;
        } else if (index == this.size() - 1) {
            Item last = this.getItem(this.size() - 1);
            this.getItem(this.size() - 2).next = null;
            currentSize--;
            //System.out.println("2" + last.value);
            return last.value;
        } else {
            Item toRemove = this.getItem(index);
            Item before = this.getItem(index - 1);
            Item after = this.getItem(index + 1);
            before.next = after;
            currentSize--;
            return toRemove.value;
        }
    }
}