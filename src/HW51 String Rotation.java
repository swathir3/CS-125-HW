/*
    Let’s continue practicing with functions and Strings.
    Write a function called rotateRight that takes a String as its first argument and a positive int as its second
    argument and rotates the String right by the given number of characters. Any characters that get moved off the
    right side of the string should wrap around to the left.
    Here are some examples:
        - CS125 rotated right by 1 becomes 5CS12
        - CS125 rotated right by 2 becomes 25CS1
        - CS125 rotated right by 5 becomes CS125
        - CS125 rotated right by 6 becomes 5CS12

    And here are a few hints:
        - You will want to use modular arithmetic, so please review the remainder operator in Java: %.
        - You will probably want to convert the String to an array of characters…​
        - and then back to a String before you return: String toReturn = new String(characterArray);
 */

public class forFormat {
    String rotateRight(String given, int rotate) {
        char[] letters = new char[given.length()];
        for (int i = 0; i < given.length(); i++) {
            letters[(i + rotate) % given.length()] = given.charAt(i);
        }
        String toReturn = new String(letters);
        return toReturn;
    }
}