/*
    Implement a public class called PolyPrinter containing only one public class method called print. You should define
    print to accept two objects of any type that you can call toString and equals on, while also making print as general
    as possible. If the first argument to print is equal to the second (according to equals), you should return the
    first argument as a String (using toString). If they are not equal you should return the second argument as a
    String. If either argument is null you should return null. Finally, you should prevent PolyPrinter from being
    extended, meaning that no classes should be able to inherit from it.
 */

public final class PolyPrinter {
    public static String print(Object a, Object b) {
        if ((a == null) || (b == null)) {
            return null;
        }
        if (a.equals(b)) {
            return a.toString();
        } else {
            return b.toString();
        }
    }
}