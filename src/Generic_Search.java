/*
Create a public non-final generic class called YourSimpleLinkedList. You should extend SimpleLinkedList which is parameterized with a single type parameter E. Implement a single public method named search. search takes as a parameter a single reference of the same type as the type parameter and returns true if the list contains the element and false otherwise. If search is passed a null reference you should throw an IllegalArgumentException.

A portion of the class you are extending is shown below for reference:

public class SimpleLinkedList<E>  {
    class Item {
        E value;
        Item next;
        Item(E setValue, Item setNext) {
            value = setValue;
            next = setNext;
        }
    }
    protected Item start;
    // Remainder elided for brevity
 */
public class Generic_Search<E> extends SimpleLinkedList {
    public boolean search(E compare) {
        if (compare == null) {
            throw new IllegalArgumentException();
        }
        for (Item current = start; current != null; current = current.next) {
            if (current.value.equals(compare)) {
                return true;
            }
        }
        return false;
    }
}