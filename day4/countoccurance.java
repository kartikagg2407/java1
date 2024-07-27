package day4;
public class countoccurance {
    static int lower(int[] arr , int n){
        int low = 0 , high = arr.length-1 , mid , firstoccurance = -1;
        while(low<=high){
            mid = (low + high)/2;
            if (arr[mid] == n){
                firstoccurance=mid ;
                high = mid - 1;
            }
            else if (arr[mid]<n){
                low = mid +1;
            }
            else{
                high = mid-1;
            }
        }
        return firstoccurance ;
    }
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
    static int occurance(int[] arr , int n){
        int lb = lower(arr, n);
        if ( lb==-1 || lb == arr.length ) return 0;
        int ub = upper(arr, n);
        return ub-lb;
    }
    public static void main(String[] args) {
        int[] num = {1,3,3,3,3,4,5,6,7,7,7,8,9};
        System.out.println(occurance(num , 3));
    }
}
