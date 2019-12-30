/*
    In this homework problem we’ll finish implementing the SimpleList interface shown above in a class called
    SimpleArrayList. We have provided starter code for you including a constructor that takes an initial array of
    Object references. We are also providing code for the get, set, and size methods—which you completed yesterday—and
    for remove, to give you an idea of how to approach add. Note that at this point we are testing the entire interface
    shown above.

    The code that we provide makes the following assumptions:
        - Your constructor will not be called with a null array
        - If get is called with an invalid index it returns null
        - If set or remove are called with an invalid index nothing happens. remove will return null in this case.

    Your job is to complete add. Like set, you can ignore invalid indices. We will test them.
 */

public class SimpleArrayList implements SimpleList {
    /** Internal array for storing values. */
    private Object[] array;

    /**
     * Create a list from an array of Objects.
     *
     * Copies references from the passed array so that
     * modifications to this list will not affect the original array.
     * We'll need to make copies of the array later to support add and remove,
     * so this is the right thing to do now.
     *
     * @param originalArray original array of Objects used to create the list
     */
    SimpleArrayList(Object[] originalArray) {
        // Would normally need to defend against originalArray being null,
        // but we'll defer that until later.
        if (originalArray != null) {
            array = new Object[originalArray.length];
            for (int i = 0; i < originalArray.length; i++) {
                array[i] = originalArray[i];
            }
        }
    }

    public Object get(int index) {
        if (index < 0 || index >= array.length) {
            return null;
        }
        return array[index];
    }
    public void set(int index, Object element) {
        if (index < 0 || index >= array.length) {
            return;
        }
        array[index] = element;
    }

    public int size() {
        return array.length;
    }

    public Object remove(int removeIndex) {
        if (removeIndex < 0 || removeIndex >= array.length) {
            return null;
        }

        // remove returns the item being removed
        Object toReturn = array[removeIndex];

        // Create and populate our new smaller array. We use for loop syntax
        // maintaining two indices.
        Object[] newArray = new Object[array.length - 1];
        int originalIndex = 0;
        for (int newIndex = 0; newIndex < newArray.length; newIndex++) {
            // Skip the spot that we are removing
            if (newIndex == removeIndex) {
                originalIndex++;
            }
            newArray[newIndex] = array[originalIndex];
            originalIndex++;
        }
        array = newArray;
        return toReturn;
    }
    public void add(int addIndex, Object element) {
        if (addIndex < 0 || addIndex > array.length + 1) {
            return;
        }
        int originalIndex = 0;
        Object[] newArray = new Object[array.length + 1];
        for (int newIndex = 0; newIndex < newArray.length; newIndex++) {
            if (newIndex == addIndex) {
                newArray[newIndex] = element;
            } else {
                newArray[newIndex] = array[originalIndex];
                originalIndex++;
            }
        }
        array = newArray;
    }
}