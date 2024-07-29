package assignment2;

import java.util.Scanner;

public class q12 {
    static void chewbacca(long n){
        long x = n;
        long p = 0;
        while (x!=0){
            x/=10 ;
            p++;
        }
        long s = 0;
        long a;
        long b = 0;
        long c = 0;
        while (n!=0){
            a = n%10;
            c++;
            if (a==9 && c == p){
                s += a*Math.pow(10, b);
            }
            else if (9-a<a){
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
        sc.close();
    }
}
