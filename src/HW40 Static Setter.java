/*
    Although static variables are rare, a possible use for them is when every instance of a class does in fact share
    some information. In this example, imagine that we are building a banking application for a client. These days
    bank names seem to change all of the time, so we want a way to quickly and easily change the bank name associated
    with all Account instances in the future.

    Define a public class named Account with a private class variable called bankName, which you should initialize to
    be the empty string. Provide a public setter for bankName allowing it to be changed following our usual conventions
    regarding setters. Provide an Account constructor that takes a single String argument—the name of the person you
    are creating an account for. Then provide a public instance method called toString that takes no arguments and
    returns a String in the following format: "(Person Name)'s account at (Bank Name)".
 */

public class Account {
    private static String bankName = "";
    private String name;
    public static void setBankName(String bName) {
        bankName = bName;
    }
    Account(String pName) {
        name = pName;
    }
    public String toString() {
        return name + "'s account at " + bankName;
    }
}