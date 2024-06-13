package instructor.week10;

/*ArrayList - sorting in ascending
Write a method that can sort the ArrayList in Ascending order without using
the sort method*/


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class W10_ArrayListAscending {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<String>(Arrays.asList("Cydeo", "B25", "Java", "Selenium"));

        list.add("Aaron");

        sortingArrayAsc(list);
//++++++++++++++++++++++++++++++++++++++++++++++++++++++
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
        SortingArrayListAsc(list1);

        // Printing the sorted ArrayList
        System.out.println("After Sorting : " + list1);


    }

    public static void sortingArrayAsc(ArrayList<String> arr) {

        String[] array = new String[arr.size()];
        array = arr.toArray(array);
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void SortingArrayListAsc(List<Integer> list1) {
        for (int i = 0; i < list1.size(); i++) {
            for (int j = 0; j < list1.size(); j++) {
                if (list1.get(i) < list1.get(j)) {
                    Integer temp = list1.get(i);
                    list1.set(i, list1.get(j));
                    list1.set(j, temp);
                }
            }
        }


    }

    }
