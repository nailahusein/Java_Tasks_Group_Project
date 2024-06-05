package Dina.week09;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListRemoveName {

    public static void main(String[] args) {

        /*
        ArrayList - Remove "Ahmed"
        Given a list of people's name "Ahmed", "John", "Eric", "Ahmed"....
        Write a java operation to remove all the names named Ahmed

        */

        List<String> names = new ArrayList<>();
        names.add("Ahmed");
        names.add("John");
        names.add("Eric");
        names.add("Ahmed");

        System.out.println("Before removal: " + names);

        // using a simple for loop to iterate over the list in reverse order
        for (int i = names.size() - 1; i >= 0; i--) { // within the loop we check each element of the list
            if (names.get(i).equals("Ahmed")) {
                names.remove(i); // once we get a match with the name Ahmed we remove it using remove method
            }
        }

        System.out.println("After removal: " + names);
    }


    }


