// print array in reverse order
public class array2 {
    static void reverse_array(int[] arr){
        int a=arr.length;
        for (int i=0 ; i<a ; i++){
            System.out.print(arr[a-i-1]);
        }
    }
    public static void main(String[] args) {
        int [] num= new int [5];
        for (int i=0 ; i<5 ; i++){
            num[i] = i+1;
        }
        reverse_array(num);
    }
}
