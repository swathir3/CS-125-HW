/*
    interface Doer {
        boolean did()
        int it(boolean toDo);
     }
     Create a class called DoIt that implements the interface shown above. The return values of each function are up to you.
 */

public class DoIt implements Doer {
    public boolean did() {
        return true;
    }
    public int it(boolean toDo) {
        return 100;
    }
}