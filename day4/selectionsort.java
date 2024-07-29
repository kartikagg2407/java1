package day4;

public class selectionsort {
    static void selection(int[] arr){
        for (int i=0 ; i<arr.length-1 ; i++){
            int idx = minimumvalue(arr , i);
            int temp = arr[i];
            arr[i] = arr[idx];
            arr[idx] = temp;
        }
        for (int i:arr){
            System.out.print(i + " ");
        }
    }
    static int minimumvalue(int[] arr , int a){
        int mini =a ;
        for (int i = a+1 ; i<arr.length ; i++){
            if(arr[mini]>arr[i]){
                mini = i;
            }
        }
        return mini;
    }
    public static void main(String[] args) {
        int[] num = {9,6,7,4,5,8,2,1,3,-5};
        selection(num);
    }
}

