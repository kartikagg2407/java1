package day9;

import java.util.ArrayList;
import java.util.Collections;

public class array_list {
    public static void main(String[] args) {
        
        // syntax
        ArrayList<Integer> arr = new ArrayList<>();
        
        //add
        arr.add(100);
        arr.add(20);
        arr.add(305);
        
        //display
        System.out.println(arr);
        
        //get 
        System.out.println(arr.get(1));
        
        //remove
        // arr.remove(1);
        // System.out.println(arr);

        //update
        // arr.set(1, 100);
        // System.out.println(arr);

        //sort
        Collections.sort(arr);
        System.out.println(arr);

        //insert
        arr.add(3, 29);
        System.out.println(arr);
    }
}
