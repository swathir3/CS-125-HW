/*
    Complete the implementation of the EquilateralTriangle class as described below. The relevant description is
    provided here for reference:

    Create and complete the implementation of this class. Your should be public, inherit from the Shape class, and
    provide the following methods:

    1. Constructor that takes an int. Created a new EquilateralTriangle object with the specified side length.
       You can assume that the passed side length is not less than or equal to zero. You should class the Shape
       constructor using super and pass it the String "equilateraltriangle" to identify this shape.
    2. Public instance method area that takes no arguments and returns a double. Return the area of this
       EquilateralTriangle: (Math.sqrt(3) / 4.0) * length * length.
    3. Override public boolean equals(Object other). Return true if the other EquilaterialTriangle has the same side
       length as this one, or false if it does not, if other is null, or if other is not an
       EquilateralTriangle.

    Note that your class should not expose any of its private state publicly.

 */

public class EquilateralTriangle extends Shape {
    private int sideLength;
    EquilateralTriangle(int sLength) {
        super("equilateraltriangle");
        sideLength = sLength;
    }
    public double area() {
        return ((Math.sqrt(3) / 4.0) * sideLength * sideLength);
    }

    public double getLength() {
        return sideLength;
    }

    public boolean equals(Object other) {
        if (other == null || (!(other instanceof EquilateralTriangle))) {
            return false;
        }
        EquilateralTriangle et = (EquilateralTriangle) other;
        if (et.getLength() == this.getLength()) {
            return true;
        } else {
            return false;
        }
    }
}