package narmin.week10;

import java.util.*;

public class MapSorter {
    //Map - Sort the map by values
    //Write a method that can sort the Map by values.

    public static void main(String[] args) {
        // Sample map. Here, I create a HashMap with some key-value pairs.
        Map<String, Integer> unsortedMap = new HashMap<>();
        unsortedMap.put("Apple", 3);
        unsortedMap.put("Banana", 2);
        unsortedMap.put("Cherry", 5);
        unsortedMap.put("Date", 1);

        //I sort the map by values
        Map<String, Integer> sortedMap = sortByValue(unsortedMap);

        // I print the sorted map
        for (Map.Entry<String, Integer> entry : sortedMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }

    public static Map<String, Integer> sortByValue(Map<String, Integer> map) {
        // 1. Convert map entries to a list ( this is necessary because, lists can be sorted, maps cannot)
        List<Map.Entry<String, Integer>> list = new LinkedList<>(map.entrySet());

        // 2.  I sort the list using Collections.sort() with a custom comparator
        // that compares the values of the map entries.
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return (o1.getValue()).compareTo(o2.getValue());
            }
        });

        // 3. I create a LinkedHashMap to maintain the insertion order.
        // By inserting the entries from the sorted list into the LinkedHashMap, I ensure the map is sorted by values.
        Map<String, Integer> sortedMap = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> entry : list) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }

        // 4. Return the sorted map
        return sortedMap;
    }
}
