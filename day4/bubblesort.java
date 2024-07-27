package day4;

public class bubblesort {
    static void bubble(int[] arr){
        for (int i=1 ; i<arr.length ; i++){
            for (int j=0 ; j<arr.length-i ; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for (int i : arr){
            System.out.print(i + " ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {2,7,8,9,6,5,3,5,1};
        bubble(arr);
    }
}
