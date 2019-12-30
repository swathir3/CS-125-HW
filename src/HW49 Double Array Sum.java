/*
    Let’s get some practice working with multi-dimensional arrays! To ease ourselves in, we’ll begin with looking at
    two dimensional arrays.

    Write a function called arraySum that returns the sum (as an int) of all the values in a two-dimensional array
    of int values.

    Note that the passed array may be null or non-rectangular. If the array is null you should return 0. If the array
    is non-rectangular you should still correctly sum all elements.
 */

public class forFormat {
    int arraySum(int[][] given) {
        int sum = 0;
        if (given == null) {
            return 0;
        }
        for (int i = 0; i < given.length; i++) {
            for (int n = 0; n < given[i].length; n++) {
                sum += given[i][n];
            }
        }
        return sum;
    }
}