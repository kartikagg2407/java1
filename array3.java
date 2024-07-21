import java.util.*;
public class array3 {
    static void reverse(int[] p ){
        int a=p.length;
        int[] q = new int [a];
        System.arraycopy(p, 0, q, 0, a);
        for (int i=0 ; i<(a+1)/2 ; i++){
            p[i] = p[a-i-1];
            p[a-i-1] = q[i];
        }
        System.out.print("Rverse of the array is : ");
        for (int i:p)
        System.out.print(i + "  ");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int a=sc.nextInt();
        int [] num= new int [a];
        int b = num.length;
        for (int i=0 ; i<b ; i++){
            System.out.print("Enter the value of "+ (i+1) + " index : ");
            int c = sc.nextInt();
            num[i] = c;
        }
        reverse(num);
        sc.close();
    }
}
