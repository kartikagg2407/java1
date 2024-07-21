// to swap certain values of array
import java.util.Arrays;

public class array5 {
    static void swap(int[] arr , int i , int j){
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }
    static void revswap(int[] arr , int a , int b){
        for (int i=a , j=b ; i<j ; i++ , j-- ){
            swap(arr, i, j);
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int [] num = new int[6];
        for (int i=0 ; i<num.length ; i++){
            num[i] = i+1;
        }
        revswap(num, 0 , 5);
    }
}
