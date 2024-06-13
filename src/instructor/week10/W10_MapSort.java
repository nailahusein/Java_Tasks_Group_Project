package instructor.week10;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/*
Map - Sort the map by values
Write a method that can sort the Map by values.
 */
public class W10_MapSort {
    public static void main(String[] args) {
        Map<String, Integer> map = new LinkedHashMap<>();
        map.put("k0", 0);
        map.put("k5", 10);
        map.put("k2", 3);
        map.put("k1", 7);
        map.put("k3", 9);

        for (String each : map.keySet()) {
           // System.out.println("key:" +each);
            System.out.println("key: " + each + " value: " + map.get(each));
        }
        System.out.println("----------------------");
        System.out.println("2nd "+ map);
        System.out.println("----------------------");

        for (Integer mapvalues: map.values()){
            System.out.println("mapvalues = " + mapvalues);
        }

        System.out.println("-----------------------");
        System.out.println("sortByValue(map) = " + sortByValue(map));

        
    }
    /*
        Write a method that can sort the map by values
     */

    public static Map<String, Integer> sortByValue(Map<String, Integer> map) {
        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort(Map.Entry.comparingByValue());

        map = new LinkedHashMap<>();

        for (Map.Entry<String, Integer> each : list) {
            map.put(each.getKey(), each.getValue());
        }

        return map;

    }

}
/*public class SortMapByValues {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("A", 4);
        map.put("B", 3);
        map.put("C", 2);
        map.put("D", 1);
        System.out.println(map);
        System.out.println("===============");
        Map<String, Integer> res = sortByValue(map);

        System.out.println(res);
    }

    private static Map<String, Integer> sortByValue(Map<String, Integer> map) {
        //Create a list of Entry
        ArrayList<Map.Entry<String, Integer>> values = new ArrayList<>(map.entrySet());
        //sort the list against Entry value
        values.sort(Map.Entry.comparingByValue());
        //create an empty map
        Map<String, Integer> result = new LinkedHashMap<>();

        //put the sorted list of entry into the new map
        for (Map.Entry<String, Integer> eachEntry : values) {
            result.put(eachEntry.getKey(), eachEntry.getValue());
        }

        return result;
    }
}*/