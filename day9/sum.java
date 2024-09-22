package day9;

import java.util.ArrayList;

public class sum {
    static int sum_sublist(ArrayList<Integer> arr , int start , int end){
        int sum = 0;
        for (int i=start ; i<end ; i++){
            sum += arr.get(i);
        }
        return sum;
    }
    static ArrayList<Integer> maxsum(int[] arr , int k){
        ArrayList<Integer>  arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();
        int subsum = 0;
        int index = 0;
        for (int i=0 ; i<arr.length ; i++){
            arr1.add(arr[i]);
        }
        for (int i = 0 , j = k ; j <= arr.length ; i++ , j++){
            int a = sum_sublist(arr1, i, j);
            if (a>subsum){
                subsum = a;
                index = i;
            }
        }
        for (int n=index ; n<index + k ; n++)
                arr2.add(arr1.get(n));
        return arr2;
    }
    public static void main(String[] args) {
        int[] nums = {30,30,30,10,20,10,1,40,40};
        int n = 2;
        ArrayList<Integer> arr = maxsum(nums, n);
        System.out.println(arr);
    }
}
