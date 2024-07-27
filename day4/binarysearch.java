package day4;

public class binarysearch {
    static int binary(int[] arr , int n){
        int low = 0 , high = arr.length-1 , mid = 0;
        while(low<=high){
            mid = (low + high)/2;
            if (arr[mid] == n){
                return mid;
            }
            else if (arr[mid]<n){
                low = mid +1;
            }
            else{
                high = mid-1;
            }
        }
        return -1 ;
    }
    public static void main(String[] args) {
        
        int[] num = new int[8];
        for (int i=0 ; i<num.length ; i++){
            num[i] = i+1;
        }
        System.out.println(binary(num, 6));
    }
}
