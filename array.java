import java.util.*;
public class array {
    static int sum(int[] arr){
        int s=0 ; 
        for (int i:arr){
            s+=i;
        }
        return s;
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
        System.out.println("The sum of number in array is : " + sum(num));
        sc.close();
    }
}
