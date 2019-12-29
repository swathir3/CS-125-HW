/*
    Implement a Person class storing a person’s name (as a String) and age (as an int). You should provide a constructor
    that accepts the name as the first argument and the age as the second argument.

    You should implement hashCode as described here. Specifically:
        - If hashCode is called twice on the same object—that is, if neither the name or age has been changed—it should
            return the same int.
        - If two Persons are equal—that is, have the same name and age—hashCode should return the same value.

    In this case, if two Person objects are not equal your hashCode implementation should return different results.
    We will test this using random inputs.

    Note that Strings have their own hashCode method which you may want to use in your implementation. An int is not an
    object and so doesn’t provide hashCode, but there are several ways to include it in your implementation. Also note
    that you may not be able to complete this homework problem until after the lecture on hashing.
*/

public class Person {
    private String prevStr;
    private String name;
    private int prevAge;
    private int age;
    private int lastReturn = 0;
    public Person(String myName, int myAge) {
        prevStr = myName;
        prevAge = myAge;
        name = myName;
        age = myAge;
    }
    public void setName(String currName) {
        prevStr = name;
        name = currName;
    }
    public void setAge(int thisAge) {
        prevAge = age;
        age = thisAge;
    }
    public int hashCode() {
        if (prevAge == age && prevStr.equals(name)) {
            return age;
        }
        return age - 1;
    }
}