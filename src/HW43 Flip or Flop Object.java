/*
    Define a public class named Flip with a single public instance method called flop that takes no parameters and
    returns a boolean. It should also provide a single constructor that takes a boolean argument that sets the initial
    state of the Flip instance.

    However, the internal state of your Flip class should be private. Our test suite will check for this.
 */

public class Flip {
    boolean state = true;
    Flip(boolean currState) {
        state = currState;
    }
    public boolean flop() {
        if (state == false) {
            state = true;
        } else if (state == true) {
            state = false;
        }
        return state;
    }
}