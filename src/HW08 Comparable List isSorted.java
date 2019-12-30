/*
    As a final wrap-up to our series of homework problems on sorting we’ll write a function to test if a List of
    Comparables is sorted is ascending order or not. Implement a public non-final class called Sorted that provides a
    single static method isSorted. isSorted should accept a List of Comparables and return true if the list is sorted
    and false otherwise. If the list is null isSorted should return false.
*/

import java.util.List;
public class Sorted {
    public static boolean isSorted(List<Comparable> list) {
        boolean toReturn = true;
        if (list == null) {
            return false;
        }
        for (int i = 0; i < list.size() - 1; i++) {
            if ((list.get(i)).compareTo((list.get(i + 1))) > 0) {
                toReturn = false;
            }
        }
        return toReturn;
    }
}