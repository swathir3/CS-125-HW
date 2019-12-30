/*
    Create a class called StringLength that implements a version of the Java Comparable interface as shown above.
    StringLength wraps a String and should provide a constructor that takes a String as a single parameter, which is
    stored internally by each instance of StringLength.

    Comparable allows objects to be put in order. In this case, you should order StringLength objects based on the
    length of their String instance variable. Specifically compareTo should return:
        -  -1 if this object is less than other, or if other is null or not an instance of StringLength
        - 0 if other is equal to the specified object
        - 1 if this object is greater than other
 */

public class StringLength implements Comparable {
    private String word;
    public StringLength(String setWord) {
        word = setWord;
    }
    public int compareTo(Object other) {
        if ((other == null) || (!(other instanceof StringLength))) {
            return -1;
        }
        StringLength otherString = (StringLength) other;
        if (word.length() < otherString.word.length()) {
            return -1;
        } else if (word.length() == otherString.word.length()) {
            return 0;
        } else {
            return 1;
        }
    }
}