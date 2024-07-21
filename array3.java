// to reverse an array
import java.util.Arrays;

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
    }
    public static void main(String[] args) {
        int [] num= new int [5];
        for (int i=0 ; i<5 ; i++){
            num[i] = i+1;
        }
        reverse(num);
        System.out.println(Arrays.toString(num));
    }
}
