import java.util.*;
public class array2 {
    static void reverse_array(int[] arr){
        int a=arr.length;
        for (int i=0 ; i<a ; i++){
            System.out.print(arr[a-i-1]);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int a=sc.nextInt();
        int [] num= new int [a];
        int b = num.length;
        for (int i=0 ; i<b ; i++){
            System.out.print("Enter the value of "+ (i+1) + " th index : ");
            int c = sc.nextInt();
            num[i] = c;
        }
        reverse_array(num);
        sc.close();
    }
}
