/*
    Create a public non-final class called InsertionSorter. It should provide one public class method called sort.
    Sort should accept an array of Comparable Java objects and sort them in ascending order. However, it should sort
    the array in place, meaning that you modify the original array, and return the number of swaps required to sort the
    array. That’s how we’ll know you’ve correctly implemented insertion sort. If the array is null or empty you should
    return 0. You can assume that the array does not contain any null values.

    To receive credit implement insertion sort as described in class. Have the sorted part start at the beginning of
    the array and grow to the right. Each each step take the left-most value from the unsorted part of the array and
    move it leftward, swapping elements until it is in the right place. Note that you should not swap equal values.
    This will both make your sort unstable and cause you to fail the test. When you are finished the array should be
    sorted and you should return the count of swaps required.

    As a reminder, first.compareTo(second) returns a positive value if first is larger than second, a negative value if
    first is smaller than second, and 0 if they are equal.
 */

public class InsertionSorter {
    public static int sort(Comparable[] objects) {
        int count = 0;
        if (objects == null || objects.length == 0) {
            return 0;
        }
        for (int i = 1; i < objects.length; i++) {
            Comparable key = objects[i];
            int j = i - 1;
            while (j >= 0 && objects[j].compareTo(key) > 0 && objects[j].compareTo(key) != 0) {
                objects[j + 1] = objects[j];
                j = j - 1;
                count++;
            }
            objects[j + 1] = key;
        }
        return count;
    }
}