package assignment2;
import java.util.*;
public class q11 {
    static void gcd(int n1 , int n2){
        int a;
        if (n1>=n2){
            a=n2;
        }
        else{
            a=n1;
        }
        for (int i=a ; i>=1 ; i--){
            if (n1%i==0 && n2%i==0){
                System.out.println(i);
                break;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        gcd(n1, n2);
        sc.close();
    }
}
