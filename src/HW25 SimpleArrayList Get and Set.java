/*
    The next few homework problems will have you implement the SimpleList interface shown above in a class called
    SimpleArrayList. We have provided starter code for you including a constructor that takes an initial array of
    Object references.

    Note that you can make the following assumptions:
        - Your constructor will not be called with a null array
        - Neither get or set will be called with an invalid index
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
        return array[index];
    }
    public void set(int index, Object element) {
        array[index] = element;
    }
    public int size() {
        int sizeA = 0;
        for (int i = 0; i < array.length; i++) {
            sizeA++;
        }
        return sizeA;
    }
}