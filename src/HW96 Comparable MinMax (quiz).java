/*
    Complete the implementation of a public non-final class called MinMax. MinMax should provide the following instance methods:
        - add: takes a reference to any Java object that implements Comparable.
        - min: takes no arguments and returns a reference (as a Comparable) to the minimum of all values previously
            added to the instance using add. If no values have been added it should return null.
        - max takes no arguments and returns a reference (as a Comparable) to the maximum of all values previously
            added to the instance using add. If no values have been added it should return null.

    You should compare Comparable objects using compareTo. As a reminder, first.compareTo(second) returns a positive
    value if first is larger than second, a negative value if first is smaller than second, and 0 if they are equal.

    MinMax should also provide two constructors:
        - An empty constructor that takes no arguments.
        - A constructor taking a single reference to a Comparable object. This constructor behaves like the empty
        constructor followed by a call to add.
 */

public class MinMax {
    private Comparable min;
    private Comparable max;

    MinMax() {
    }

    MinMax(Comparable o) {
        min = o;
        max = o;
    }

    public void add(Comparable o) {
        if (min == null) {
            min = o;
        } else {
            if (o.compareTo(min) < 0) {
                min = o;
            }
        }
        if (max == null) {
            max = o;
        }  else {
            if (o.compareTo(max) > 0) {
                max = o;
            }
        }
    }

    public Comparable min() {
        return min;
    }

    public Comparable max() {
        return max;
    }
}