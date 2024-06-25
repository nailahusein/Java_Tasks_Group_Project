package instructor.week11;

import java.util.HashMap;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;
//Write a method that can return the minimum value from ta map (DO NOT use sort method)
public class W11_MapMinValue {


    public static void main(String[] args) {
        Map<String, Integer> test= new HashMap<>();
        test.put("Aaron", 11);
        test.put("Baron", 5);
        test.put("Cydeo", 27);
        test.put("Canada", 100);
        System.out.println(minValue(test));
    }


    public  static  int  minValue( Map<String,Integer> map  ) {
        SortedSet<Integer> sm = new TreeSet<>(map.values());
        return sm.first();
    }



}
/*//Write a method that can return the minimum value from ta map (DO NOT use sort method)
public class mapMinValue {

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("A", 4);
        map.put("B", 3);
        map.put("C", 2);
        map.put("D", 1);

        System.out.println(minValue(map));

    }

    public  static  int  minValue( Map<String,Integer> map  ) {
        SortedSet<Integer> sm = new TreeSet<>(map.values());
        return sm.first( );
    }
}
*/

/*public static Integer getMinValue(Map<String, Integer> map) {
        Integer minValue = null;
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            Integer value = entry.getValue();
            if (minValue == null || value.compareTo(minValue) < 0) {
                minValue = value;
            }
        }
        return minValue;
    }*/

/*public static int minValue(Map<String, Integer> map){

        Set<Integer> set = new TreeSet<>(); //no duplicates, ascending sorted order

        for (Map.Entry<String, Integer> eachSet : map.entrySet()) {
        //for each loop to get each key and each value
            set.add(eachSet.getValue()); //adding those keys and values into the set
        }

        for (Integer each : set) { //getting each of the integers from that set
            return each;

        }
        return 0;

    }*/
/*public static Map.Entry<String, Integer> minValue2(Map<String,Integer> map){

        Map.Entry<String, Integer> min = null;
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (min == null || min.getValue() > entry.getValue()) {
                min = entry;
            }
        }

        System.out.println(min.getKey()); // 0.1



        return min;
    }*/

/*public static Map.Entry<String,Integer> minValue3(Map<String,Integer> map){
        return Collections.min(map.entrySet(),
                Map.Entry.comparingByValue());


    }*/

/*public static Integer getMinValue(Map<String, Integer> map) {
        Integer minValue = null;
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            Integer value = entry.getValue();
            if (minValue == null || value.compareTo(minValue) < 0) {
                minValue = value;
            }
        }
        return minValue;
    }*/
/*public static int minValue(Map<String, Integer> map){ Set<Integer> set = new TreeSet<>();
for (Map.Entry<String, Integer> eachSet : map.entrySet()) { set.add(eachSet.getValue());
}
int a= 0;
for (Integer each : set) {
a= each; break;
}
return a; }*/

/*public static void main(String[] args) {

        Map<String,Integer> map = new LinkedHashMap<>();
        map.put("age1", 16);
        map.put("age2", 20);
        map.put("age3", 18);
        System.out.println(minValue(map));
    }

    public static int minValue(Map<String,Integer> map){ // method takes "Map<String,Integer>" and returns min value of Map

        Set<Integer> set = new TreeSet<>(); //creating a "TreeSet<>()" named set to store the values of Map

        for (Map.Entry<String, Integer> eachSet : map.entrySet()) { // iterates each entry in the input Map
            set.add(eachSet.getValue()); // and adds the value to the set
        }
        return Collections.min(set); // calling the min method of the Collections and passes set as argument
        // then min method returns the smallest element in the set
    }
}

// the code finds the minimum value by creating a TreeSet of its values then using "Collections.min" it finds smallest elemen  */


/*public static String minimum(Map<String,Integer> map){

        String name = "";
        int min = Integer.MAX_VALUE; // by default this is the min value

        for (Map.Entry<String, Integer> eachEntry : map.entrySet()) { // loop through the Map
            if (eachEntry.getValue() < min) { // get each value and compare with the min value
                 min = eachEntry.getValue();  // if less than current min assign to the min
                 name = eachEntry.getKey();   // get the key value
            }
        }
        return name + " with " + min + " $ "; // return the min value
    }*/

/*public static void main(String[] args) {

        Map<String, Integer> map = Map.of("A", 5,
                                          "B", 3,
                                          "C", 7,
                                          "D", 1);
        System.out.println("minValue(map) = " + minValue(map));
    }


    public static int minValue(Map<String, Integer> map){

        int min = Integer.MAX_VALUE; //to ensure that 1st value is always <=min

        for(Integer eachValue : map.values()){
            if(eachValue < min){
                min = eachValue;
            }
        }
        return min;


    }
}*/