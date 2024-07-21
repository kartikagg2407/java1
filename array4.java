// swap values of array
public class array4 {
    static void swap(int[] arr , int i , int j){
        int temp = arr[i];
        arr[j] = arr[i];
        arr[i] = temp;
    }
    public static void main(String[] args) {
        int [] num = new int[6];
        for (int i=0 ; i<num.length ; i++){
            num[i] = i+1;
        }
        swap(num , 2 , 4);
        for(int i:num){
            System.out.print(i + " ");
        }
    }
}
