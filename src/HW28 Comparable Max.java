/*
    Create a class called Max that provides a single class method called max. max takes two arguments to objects that
    can be compared—that is, that implement the Java Comparable interface as shown above. It returns a reference to
    whichever is larger. If the two objects are equal, you should return the first.

    As a reminder, first.compareTo(second) returns a positive value if first is larger than second, a negative value
    if first is smaller than second, and 0 if they are equal. How Comparable is implemented is up to each class, and
    your method will be called on multiple different kinds of objects.

    As a starting point, the function signature for max is: public static Comparable max(Comparable first, Comparable second)
 */
public class Max {
    public static Comparable max(Comparable first, Comparable second) {
        if ((first.compareTo(second)) > 0) {
            return first;
        } else if ((first.compareTo(second)) < 0) {
            return second;
        } else {
            return first;
        }
    }
}