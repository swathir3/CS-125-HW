/*
    Implement a public final class named WordCounter. WordCounter should provide a single static method countWords,
    which takes a String and returns a Map from Strings to Integers. Each entry in the map should have a value (Integer)
    representing how many times that key (String) appeared in the String that was passed to countWords.

For example:

Map<String, Integer> counts = WordCounter.countWords("CS 125 is awesome");
System.out.println(counts.get("CS")); // prints 1
System.out.println(counts.get("125")); // prints 1
System.out.println(counts.get("225")); // prints null
counts = WordCounter.countWords("CS 125 is really really awesome!");
System.out.println(counts.get("really")); // prints 2
System.out.println(counts.get("awesome!")); // prints 1
System.out.println(counts.get("awesome")); // prints null
You should split the string based on single space characters and do not need to provide special handling for punctuation.
If the passed string is null you should return null. If the passed string is empty or all whitespace you return an empty Map. (As a hint, note that splitting an empty String in Java may not do what you expect. ) You will probably need to import the Map interface and a Map implementation like HashMap.

Note that you may not be able to complete this homework problem until after Monday’s lecture on maps.
*/

import java.util.HashMap;
import java.util.Map;
public final class WordCounter {
    public static Map<String, Integer> countWords(String given) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        if (given == null) {
            return null;
        }
        if (given == "") {
            return new HashMap<String, Integer>();
        }
        String[] strings = given.split(" ");
        for (String s:strings) {
            if (!map.containsKey(s)) {
                map.put(s, 1);
            } else {
                int count = map.get(s);
                map.put(s, count + 1);
            }
        }
        return map;
    }
}