/*
    Implement a public class called ComparePets. ComparePets should provide a single static method named equals that
    takes two Pet references and returns an int. If the two Pet references are equal you should return 1. Else if the
    two Pet instances are equal you should return -1. Otherwise return 0. Note that one or both of the Pet references
    may be null, in which case you should return 0 unless both are null in which case you should return 1.
 */

public class ComparePets {
    public static int equals(Pet a, Pet b) {
        if ((a == null) && (b == null)) {
            return 1;
        } else if ((a == null) || (b == null)) {
            return 0;
        }
        if (a == b) {
            return 1;
        } else if (a.equals(b)) {
            return -1;
        } else {
            return 0;
        }
    }
}