/*
    Fix the code snippet below so that it does not throw any exceptions. (You will still need to call secret.)
    (Note that this problem may be hard to complete until after Wednesday’s lecture on exceptions and errors.)
/**
 * Don't throw any errors.
 *
 * If secret() throws an error, you should return -1.
 */
/*
public static int canFail() {
        return secret();
        }
 */
public class givenClass {
    public static int canFail() {
        try {
            return secret();
        } catch (Exception e) {
            return -1;
        }
    }
}