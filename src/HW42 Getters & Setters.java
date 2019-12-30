/*
    Define a public class named Sample with two instance variables: an int called count and a String called name.
    Provide a complete constructor that allows both fields to be initialized when instances of Sample are created with
    count as its first parameter and name as its second.

    Neither count nor name should be public. Rather, you should provide:
        - Both a getter and a setter for count
        - Only a getter for name: this is how you can create a read-only variable in Java.

    Your getters and setters should follow the naming convention we have been using in class: get or set followed by
    the name of the field, capitalized. Getters should have the same return type as the variable that they are
    returning. Setters should not return a value.
 */

public class Sample {
    private int count;
    private String name;
    Sample(int myCount, String myName) {
        this.count = myCount;
        this.name = myName;
    }
    public int getCount() {
        return count;
    }
    public void setCount(int myCount) {
        this.count = myCount;
    }
    public String getName() {
        return name;
    }
}