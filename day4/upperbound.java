package day4;

public class upperbound {
    static int upper(int[] arr , int n){
        int low = 0 , high = arr.length-1 , mid , upper = -1;
        while(low<=high){
            mid = (low + high)/2;
            if (arr[mid] == n){
                upper = mid + 1 ;
                low = mid + 1;
            }
            else if (arr[mid]<n){
                low = mid +1;
            }
            else{
                high = mid-1;
            }
        }
        return upper ;
    }
    public static void main(String[] args) {
        int[] num = {1,3,3,3,3,4,5,6,7,7,7,8,9};
        System.out.println(upper(num, 3));
    }
}
