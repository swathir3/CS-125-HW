/*
    Create a class called Minimum that provides a single class method min. min should take an array of any object that
    implements Comparable and return the minimum value from the array, using compareTo to compare object instances.
    So the function signature of min should be public static Comparable min(Comparable[] values).

    As a reminder, first.compareTo(second) returns a positive value if first is larger than second, a negative value
    if first is smaller than second, and 0 if they are equal. Note that the array of Comparable references passed to
    min will all be the same type and contain no null references. However, the array may be null or empty in which case
    you should return null.
 */

public class Minimum {
    public static Comparable min(Comparable[] values) {
        if ((values == null) || (values.length == 0)) {
            return null;
        }
        Comparable minimum = values[0];
        for (int i = 1; i < values.length; i++) {
            if ((minimum.compareTo(values[i])) > 0) {
                minimum = values[i];
            }
        }
        return minimum;
    }
}