// return sum of array
public class array {
    static int sum(int[] arr , int a , int b){
        int s=0 ; 
        if (a>b || b>arr.length || a<0 || b<0){
            return s;
        }
        for (int i=a ; i<=b ; i++){
            s+=arr[i];
        }
        return s;
    } 
    public static void main(String[] args) {
        int [] num= new int [5];
        int b = num.length;
        for (int i=0 ; i<b ; i++){
            num[i] = i+1;
        }
        System.out.println("The sum of number in array is : " + sum(num , 1 , 3));
    }
}
