package instructor.week11;

import java.util.LinkedHashMap;
import java.util.Map;

//Write a method that prints the frequency of each character from a String
public class W11_MapFrequency {
    public static void main(String[] args) {
        String test = "AaronBaron";
        FrequencyTest(test);
    }

    public static void FrequencyTest(String  str ) {
        Map<Character, Integer> map = new LinkedHashMap<>();
        for (Character each : str.toCharArray()) {  // taking each character
            if (map.containsKey(each)) { //  if it contains
                map.put(each, map.get(each) + 1);
            } else {
                map.put(each, 1);
            }
        }
        System.out.println(map);
    }



}
/*public class MapUniqueCharString {
    public static void main(String[] args) {

        String str = "accabbcd";
        Map<Character, Integer> unique = new HashMap<>();

        for( int j = 0; j < str.length(); j++) {
            int count =0;
            for (int i = 0; i < str.length(); i++) {
                if(str.charAt(i) == str.charAt(j))
                    count++;
            }
            if( count == 1){
                unique.put(str.charAt(j), count);
            }
        }

        System.out.println(unique);

    }
}*/

/*public static Map<String,Integer> frequencyOfChar(String str){ //creating the method

        Map<String,Integer> map = new LinkedHashMap<>(); //creating a linkedhashmap object

        for (int i = 0; i < str.length(); i++) { //first loop to go through the characters
            int count = 0; // variable count for frequency of the characters
            for (int j = 0; j < str.length(); j++) { //2nd loop to compare the characters next to each other
                if (str.charAt(i)== str.charAt(j)) { //if the elements at index i match the elements at index j
                    count++; //then increase their count
                }
                map.put((""+str.charAt(i)), count); // each character, their count

            }

        }
        return map;

    }*/

/*public class Map_FrequencyOfCharacter {
  public static void main(String[] args) {
    String           str="aaaccbbbbcccc"; FrequencyOfCharacter(str); }

  public static void FrequencyOfCharacter(String str){ Map<Character,Integer> map=new LinkedHashMap<>();
    for(Character each:str.toCharArray()){  // taking each character
      if (map.containsKey(each)){  //  if it contains
            map.put(each,map.get(each)+1);
      }else{ map.put(each,1);
    }
  }
System.out.println(map); }
}*/


/*public static void main(String[] args) {

        String str = "database";
        System.out.println(freqOfChars(str));

    }

    public static Map<String,Integer> freqOfChars(String str){

        Map<String,Integer> map = new LinkedHashMap<>();

        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            for (int i1 = 0; i1 < str.length(); i1++) {
                if (str.charAt(i) == str.charAt(i1)){
                    count++;
                }
                map.put(""+str.charAt(i),count);
            }

        }
        return map;
    }
}*/
    /*
public static void frequency(String str ) {

    Map<Character, Integer> map = new LinkedHashMap<>();

    for (Character each : str.toCharArray()) {
        if (!map.containsKey(each)) {
            map.put(each, 1);
        } else {
            map.put(each, map.get(each) + 1);
        }
    }
    System.out.println(map);
}

*/

/*public static void main(String[] args) {

        frequencyOfChars("stadghdkjkkl");

    }


    public static void frequencyOfChars(String str) {

        Map<String, Integer> map = new LinkedHashMap<>();

       //char[] chars = str.toCharArray();

        for (String each : str.split("")) {
            int frequency = Collections.frequency(Arrays.asList(str.split("")), each);

            map.put(each, frequency);
        }

        System.out.println(map);
    }

}*/