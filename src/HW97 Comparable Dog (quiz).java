/*
    Implement a public non-final class called Dog. Dog should provide a single constructor that takes a double, the age
    of that Dog instance. You should also provide public getters and setters for the age following our usual convention:
    getAge and setAge. Dog should not expose any of its internal state publicly.

    Dog should also implement Comparable comparing dogs based on their age. As a reminder, first.compareTo(Object second)
    returns a positive int if first is larger than second, a negative int if first is smaller than second, and 0 if they
    are equal. If second is null or not a Dog you should also return a negative value.
 */

public class Dog implements Comparable {
    private double age;
    Dog(double dogAge) {
        age = dogAge;
    }
    public double getAge() {
        return age;
    }
    public void setAge(double dogAge) {
        age = dogAge;
    }

    public int compareTo(Object o) {
        if (o == null || !(o instanceof Dog)) {
            return -1;
        }

        Dog d = (Dog) o;
        if (age == d.getAge()) {
            return 0;
        } else if (age > d.getAge()) {
            return 1;
        } else {
            return -1;
        }
    }
}
