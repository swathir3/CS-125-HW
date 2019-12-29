/*
    Create a public non-final generic class called Some, which stores a single instance of the parameterized type.
    Your constructor should take a single instance of the parameterized type and save it. You should also provide
    getValue and setValue methods that allow the saved value to be retrieved or modified. As usual, your class should
    not expose any of its state publicly.

    Note that you may not be able to complete this homework problem until after the lecture on generics. We’ve also
    provided some starter code that uses T as the type parameter to help you get started.
*/

public class Some<T> {
    private T value;
    Some(T myValue) {
        value = myValue;
    }
    public T getValue() {
        return value;
    }
    public void setValue(T myValue) {
        value = myValue;
    }
}
