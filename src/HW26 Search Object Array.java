/*
    Create a class called Searcher that provides a single class method search. search should accept an array of Object
    references as its first parameter and a single Object reference as its second parameter. It should return true if
    the array passed first contains an Object that is equal to the single Object passed second. It should return false
    if the array does not contain the Object, or if either the array or the Object are null. Note that the array may
    contain null references.
 */

public class Searcher {
    public static boolean search(Object[] values, Object a) {
        boolean toReturn = false;
        if (values == null) {
            return toReturn;
        }
        if (a == null) {
            return toReturn;
        }
        for (int i = 0; i < values.length; i++) {
            if (values[i] != null) {
                if (values[i].equals(a)) {
                    toReturn = true;
                }
            }
        }
        return toReturn;
    }
}