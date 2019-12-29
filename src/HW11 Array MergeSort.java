/*
    You’ve done merge (on Lists), so now it’s time to do merge sort (on arrays).

    Create a public non-final class named MergeSort that extends Merge. Implement a public static method int[]
    mergesort(int[] values) that returns the input array of ints sorted in ascending order. You will want this method
    to be recursive, with the base case being an array with zero or one value. If the passed array is null you should
    return null. If the passed array is empty you should return an empty array. You do not have to sort the array in
    place, but the returned array does not have to be a copy.

    To help you your parent class Merge provides two useful class methods:

    int[] merge(int[] first, int[] second): this merges two sorted arrays into a second sorted array. If either array
    is null it returns null, so you should not call it on a null array.

    int[] copyOfRange(int[] original, int from, int to): this acts as a wrapper on Arrays.copyOfRange, accepting the
    same arguments and using them in the same way. (You can’t use java.util.Arrays in this problem for reasons that will become obvious if you inspect the rest of the documentation…​)

    Note that the test code will test that you call merge an appropriate number of times, so you should call it to join
    single-element arrays together.
 */

public class MergeSort extends Merge {
    public static int[] mergesort(int[] values) {
        if (values == null) {
            return null;
        }
        if (values.length <= 1) {
            return values;
        }
        int n = values.length, int[] a = new int[n / 2], int[] b = new int[n - (n / 2)];
        for (int i = 0; i < a.length; i++) {
            a[i] = values[i];
        }
        for (int i = 0; i < b.length; i++) {
            b[i] = values[i + (n / 2)];
        }
        return merge(mergesort(a), mergesort(b));
    }
}