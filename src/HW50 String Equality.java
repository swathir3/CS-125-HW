/*
    Strings and other objects work a bit differently than the primitive types that we’ve been working with so far.
    Given that objects can represent simple or complex combinations of the simple pieces of data stored by primitive
    types, comparing them together becomes a bit more complicated. We’ll continue exploring that in today’s lecture
    and homework problem.

    This problem also gives you some practice working with null. Remember that if a variable is null you cannot call
    any of its methods. You can and should compare a variable against null: so first == null will evaluate to true if
    the variable first is null.

    Write a function called areEquals that takes two String arguments and returns true if the two strings are equal
    (that is, they contain the same characters) and false otherwise. Note that either first or second may be null. If
    either are null you should return false, including if both are null.
 */
public class forFormat {
    boolean areEquals(String first, String second) {
        boolean equal = true;
        if ((first == null) || (second == null)) {
            equal = false;
        }
        if ((first == null) && (second == null)) {
            equal = false;
        }
        if (first.equals(second)) {
            equal = true;
        } else {
            equal = false;
        }
        return equal;
    }
}

