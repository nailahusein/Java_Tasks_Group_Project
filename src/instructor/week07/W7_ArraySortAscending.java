package instructor.week07;

import java.util.ArrayList;
import java.util.Arrays;
/*Write a return method that can sort an int array in Ascending order
 without using the sort method of the Arrays class
Ex: int[] arr = {10, 9, 8, 7};
arr = Sort(arr); ==>{ 7, 8, 9, 10};*/
public class W7_ArraySortAscending {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(Sort(new int[] {150,5,8,9,15})));
        SortingArrayAsc( new int[] {200,15,8,9,15});
        SortArrAsc(new int[] {4,15,7,5,-3,1});



    }
    public static int[] Sort(int[] a) {
        ArrayList<Integer> list=new ArrayList<Integer>();
        for(int each: a)
            list.add(each);
        for(int i=0; i < a.length; i++) {
            a[i] = findMin(list);
            list.remove(Integer.valueOf(a[i]));
        }
        return a;
    }

    public static int findMin(ArrayList<Integer> a) {
        int min =Integer.MAX_VALUE;
        for(int each: a)
            min = Math.min(min, each);
        return min;
    }

    public static void SortingArrayAsc(int[] arr) {
        ArrayList<Integer> list = new ArrayList();
        for(int each: arr) {
            list.add(each);
        }
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size(); j++) {
                if (list.get(i) < list.get(j)) {
                    Integer temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                }
            }
        }
        System.out.println("list = " + list);
        for(int i=0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }
        System.out.println(Arrays.toString(arr));
    }

public static void SortArrAsc (int [] arr) {

    for (int i = 0; i < arr.length; i++) {
        for (int j = 0; j < arr.length; j++) {

            if (arr[i]<arr[j]){
                int temp= arr[i];
                arr[i]= arr[j];
                arr[j]=temp;
            }
        }
    }
    System.out.println(Arrays.toString(arr));


}


}
