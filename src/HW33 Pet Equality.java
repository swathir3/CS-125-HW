/*
    Implement a public class called Pet. Every pet has a String name and a double age, which are passed in that order
    to the Pet constructor. You should override equals to return true if two Pet instances have the same age and name.
    As a reminder, the signature of equals is public boolean equals(Object other). If the argument to equals is null
    or not a Pet or a descendant of Pet you should return false.
 */

public class Pet {
    private String name;
    private double age;
    Pet(String setName, double setAge) {
        name = setName;
        age = setAge;
    }
    public boolean equals(Object pet) {
        boolean toReturn = false;
        if (pet == null) {
            return toReturn;
        } else if (!(pet instanceof Pet)) {
            return toReturn;
        } else if ((((Pet) pet).name.equals(name)) && (((Pet) pet).age == age)) {
            toReturn = true;
        }
        return toReturn;
    }
}