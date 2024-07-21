// binary search

public class array7 {
    static boolean binary(int[] arr , int n ,int a , int b){
        for (int i=a , j=b ; i<j  ; ){
            int mid = (i+j)/2;
            if (arr[mid]==n){
                return true;
            }
            else if (arr[mid]<n){
                i=mid+1;
            }
            else{
                j=mid-1;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int [] num = new int[6];
        for (int i=0 ; i<num.length ; i++){
            num[i] = i+1;
        }
        System.out.println(binary(num, 5 , 2 , 5));
    }
}
