/*
    In this homework problem we’ll finish up our SimpleArrayList class by implementing Object.equals.

    We’ve provided a completed implementation of SimpleArrayList which will also be reviewed in class today. You
    should consider an instance of SimpleArrayList to be equal to any object that implements SimpleList, contains
    the same number of elements, and contains equal elements in the same order. You should use .equals to test the
    equality of object references stored in your SimpleArrayList. If the passed reference is null or not an instance
    of a class that implements SimpleList you should return false
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
    public boolean equals(Object test) {
        boolean toReturn = false;
        if ((test == null) || (!(test instanceof SimpleList))) {
            return toReturn;
        }
        SimpleList testList = (SimpleList) test;
        for (int i = 0; i < testList.size(); i++) {
            if ((testList.size() == array.length) && (testList.get(i) == array[i])) {
                toReturn = true;
            }
        }
        return toReturn;
    }

    /**
     * Get the value at a given index.
     *
     * @return the Object at the given index or null if the index is invalid
     */
    public Object get(int index) {
        if (index < 0 || index >= array.length) {
            return null;
        }
        return array[index];
    }

    /**
     * Set the value at a given index.
     *
     * @param index the index to set
     * @param element the Object to set at the specific index
     */
    public void set(int index, Object element) {
        if (index < 0 || index >= array.length) {
            return;
        }
        array[index] = element;
    }

    /**
     * Return the size of this list.
     *
     * @return the size of this list.
     */
    public int size() {
        return array.length;
    }

    /**
     * Remove the object at the passed index from the list.
     *
     * @param removeIndex the index to remove
     * @return the Object that was removed or null if the index is invalid
     */
    public Object remove(int removeIndex) {
        if (removeIndex < 0 || removeIndex >= array.length) {
            return null;
        }

        // remove returns the item being removed
        Object toReturn = array[removeIndex];

        // Create and populate our new smaller array. We maintain
        // indices for both the new and old array
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

    /**
     * Add the passed object to the list at the passed index.
     *
     * @param addIndex the index to add the passed Object at
     * @param toAdd the Object to add to the list
     */
    public void add(int addIndex, Object toAdd) {
        // Note the slightly different conditions compared to remove above,
        // since an add to one spot past the current end of the array is valid
        if (addIndex < 0 || addIndex > array.length + 1) {
            return;
        }

        // Create and populate our new smaller array. We maintain
        // indices for both the new and old array
        Object[] newArray = new Object[array.length + 1];
        int originalIndex = 0;
        for (int newIndex = 0; newIndex < newArray.length; newIndex++) {
            // Once we've reached the item to add add it and don't bump the
            // index into the original array
            if (newIndex == addIndex) {
                newArray[newIndex] = toAdd;
            } else {
                newArray[newIndex] = array[originalIndex];
                originalIndex++;
            }
        }
        array = newArray;
        return;
    }
}