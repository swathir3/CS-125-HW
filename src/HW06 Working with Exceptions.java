/*
    In this problem we’ll give you some practice working with Java exceptions. Create a public non-final class named
    Faulter. Faulter should provide a constructor taking a single String argument. It should also provide a single
    instance method called fault that takes no arguments and returns a Java Exception.

    fault should work as follows:
        - If Faulter is created with argument "NullPointer" fault should return (not throw) an exception of type
            NullPointerException.
        - If Faulter is created with argument "ArrayIndexOutOfBounds" fault should return an exception of type
            ArrayIndexOutOfBoundsException.
        - If Faulter is created with argument "ClassCast" fault should return an exception of type ClassCastException.
        - If Faulter is created with a type not listed above, or if type is null, the constructor should throw a
            IllegalArgumentException.
 */

public class Faulter {
    private String arg;
    Faulter(String a) {
        if (a == null) {
            throw new IllegalArgumentException("Illegal");
        }
        if (!(a.equals("NullPointer")) && !(a.equals("ArrayIndexOutOfBounds"))
                && !(a.equals("ClassCast"))) {
            throw new IllegalArgumentException("Illegal");
        }
        arg = a;
    }
    public Exception fault() {
        if (arg.equals("NullPointer")) {
            return new NullPointerException("That is a null argument");
        }
        if (arg.equals("ArrayIndexOutOfBounds")) {
            return new ArrayIndexOutOfBoundsException("That is out of bounds");
        }
        if (arg.equals("ClassCast")) {
            return new ClassCastException("That is a class cast error");
        }
        throw new IllegalArgumentException("Illegal");
    }
}