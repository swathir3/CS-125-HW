/*
    You’ve done partition so now it’s time to finish Quicksort.
    Create a public non-final class named Quicksort that extends Partitioner. Implement a public static method
    void quicksort(int[] values) that sorts the input array of ints in ascending order. You will want this method
    to be recursive, with the base case being an array with zero or one value. You should sort the array in place,
    which is why your function is declared to return void. If the passed array is null you should just return.
    Your solution should also not make copies of the array as it runs.

    To help you your parent class Partitioner provides a useful class method:

        - int partition(int[] values, int start, int end): this partitions values starting at start (inclusive) and
            ending at end (exclusive). It returns the position of the pivot value.

    Note that the test code will test that you call partition an appropriate number of times, so you should not call it on empty or single-item arrays. Also keep in mind that each partition does place the pivot value in the correct location. So if you start with { 2, 3, 0, 1 } and it is partitioned to { 0, 1, 3, 2 } only { 3, 2 } still needs to be partitioned, since 1 is the pivot and in the right place and 0 is a single-element array.
 */

public class Quicksort extends Partitioner {
    public static void quicksort(int[] values) {
        if (values != null) {
            quicksort(values, 0, values.length);
        }
    }
    private static void quicksort(int[] values, int low, int high) {
        int size = values.length;
        if (size == 0 || size == 1 || low >= high - 1) {
            return;
        }
        int partition = partition(values, low, high);
        quicksort(values, low, partition);
        quicksort(values, partition + 1, high);
    }
}