package assignment2;

import java.util.Scanner;

public class q12 {
    static void chewbacca(long n){
        long s = 0;
        long a;
        long b = 0;
        while (n!=0){
            a = n%10;
            if (9-a<a){
                s = s + (9-a)*(long)Math.pow(10, b);
            }
            else{
                s += a*Math.pow(10, b);
            }
            b++;
            n/=10;
        }
        if (s==0){
            System.out.println(1);
        }
        else{
        System.out.println(s);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        chewbacca(n);
    }
}
