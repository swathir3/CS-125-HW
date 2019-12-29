/*
    Create a public non-final class named Partitioner. Implement a public static method int partition(int[] values)
    that returns the input array of ints partitioned using the last array value as the pivot. All values smaller than
    the pivot should precede it in the array, and all values larger than or equal to should follow it. Your function
    should return the position of the pivot value. If the array is null or empty you should return 0.

    You will probably want to review the array partitioning algorithm presented in class. Note that we are asking you
    to partition based on the last value in the array, rather than the first. However, you can address this difference
    with a small adjustment before you begin.
 */

public class Partitioner {
    public static int partition(int[] values) {
        if (values == null || values.length == 0) {
            return 0;
        }
        int pivot = values[values.length - 1];
        int pivotPos = -1;
        for (int i = 0; i < values.length - 1; i++) {
            if (values[i] < pivot) {
                pivotPos++;
                int temp = values[pivotPos];
                values[pivotPos] = values[i];
                values[i] = temp;
            }
        }
        int temp = values[pivotPos + 1];
        values[pivotPos + 1] = values[values.length - 1];
        values[values.length - 1] = temp;
        return pivotPos + 1;
    }
}