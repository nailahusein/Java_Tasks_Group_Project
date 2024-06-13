package instructor.week10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*ArrayList - sorting in descending order
Write a method that can sort the ArrayList in descending order without
using the sort method
*/
public class W10_ArrayListDescending {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<String>(Arrays.asList("Cydeo", "B25", "Java", "Selenium"));

        list.add("Aaron");

        sortingArraysDesc(list);
//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
        ArrayList<Integer> list1 = new ArrayList<Integer>();

        // Adding elements to the ArrayList
        list1.add(410);
        list1.add(250);
        list1.add(144);
        list1.add(967);
        list1.add(289);
        list1.add(315);

        // Printing the unsorted ArrayList
        System.out.println("Before Sorting : " + list1);

        // Sorting ArrayList in ascending Order
        SortingArrayListDesc(list1);

        // Printing the sorted ArrayList
        System.out.println("After Sorting : " + list1);




    }

    public static void sortingArraysDesc(ArrayList<String> arr) {
        String[] array = new String[arr.size()];
        array = arr.toArray(array);
        Arrays.sort(array, Collections.reverseOrder());
        System.out.println(Arrays.toString(array));

    }


    public static void SortingArrayListDesc(List<Integer> list1) {
        for (int i = 0; i < list1.size(); i++) {
            for (int j = 0; j < list1.size(); j++) {
                if (list1.get(i) > list1.get(j)) {
                    Integer temp = list1.get(i);
                    list1.set(i, list1.get(j));
                    list1.set(j, temp);
                }
            }
        }
    }



}
