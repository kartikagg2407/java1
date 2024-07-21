// search a value in array using linear search
public class array6 {
    static int linear(int[] arr , int a){
        for (int i=0 ; i<arr.length ; i++){
            if (arr[i]==a){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int [] num = new int[6];
        for (int i=0 ; i<num.length ; i++){
            num[i] = i+1;
        }
        System.out.println(linear(num, 30));
    }
}
