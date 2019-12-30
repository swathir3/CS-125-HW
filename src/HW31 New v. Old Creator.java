/*
    Implement a public class called Creator. Creator should provide one public class method called newOrOld
    taking a single boolean argument. If the argument is true, newOrOld should return a reference to a new Creator
    instance. If the argument is false, newOrOld should return a reference to the last Creator created by newOrOld.
    If newOrOld has never been called before, you should return null. Creator should not expose any public state or
    allow itself to be extended.
 */

public final class Creator {
    private static Creator a = null;
    public static Creator newOrOld(boolean arg) {
        if (arg == true) {
            Creator b = new Creator();
            a = b;
            return a;
        } else {
            return a;
        }
    }
}