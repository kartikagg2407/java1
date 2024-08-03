package day4;

import java.util.Arrays;

public class insertionsort {
    // static void insertion(int arr[]){
    //     int n = arr.length;
    //     for (int i=1 ; i<n ; i++){
    //         int key = arr[i];
    //         int j = i-1;
    //         while(j>=0 && arr[j]>key){
    //             arr[j+1] = arr[j];
    //             j--;
    //         }
    //         arr[j+1] = key;
    //     }
    //     for (int i:arr){
    //         System.out.print(i + " ");
    //     }
    // }
    public static void main(String[] args) {
        int[] num = {9,6,7,4,5,8,2,1,3};
        // insertion(num);
        Arrays.sort(num);
        for (int i:num){
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println(Arrays.binarySearch(num , 0));
    }
}
