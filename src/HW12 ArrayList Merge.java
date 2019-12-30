/*
    Create a public non-final class called Merger. It should provide one public class method called merge. Merge should
    accept two Lists of sorted Comparable Java objects and return one merged List of Comparable objects. If both lists
    are null you should return null. If either is null you should return the other. If both are empty you should
    return an empty List.

    You will want to review the List documentation for an overview of helpful List operations. You will want to import
    java.util.List and a List implementation, probably java.util.ArrayList.

    Note that if you remove items from the list this will change the list’s size, so you will need to consider how this
    impacts your loops. Finally your merge function can alter first and second if needed. We don’t expect those lists
    to be the same after we call merge.

    As a reminder, first.compareTo(second) returns a positive value if first is larger than second, a negative value if
    first is smaller than second, and 0 if they are equal.
*/

import java.util.List;
import java.util.ArrayList;
public class Merger {
    public static List<Comparable> merge(List<Comparable> list1, List<Comparable> list2) {
        if (list1 == null && list2 == null) {
            return null;
        } else if (list1 == null) {
            return list2;
        } else if (list2 == null) {
            return list1;
        } else if (list1.size() == 0 && list2.size() == 0) {
            return list1;
        }
        int i = 0, j = 0, k = 0;
        int a1Size = list1.size();
        int a2Size = list2.size();
        List<Comparable> list3 = new ArrayList<>();
        while (i < a1Size && j < a2Size) {
            if (list1.get(i).compareTo(list2.get(j)) < 0) {
                list3.add(list1.get(i++));
            } else {
                list3.add(list2.get(j++));
            }
        }
        while (i < a1Size) {
            list3.add(list1.get(i++));
        }
        while (j < a2Size) {
            list3.add(list2.get(j++));
        }
        return list3;
    }
}