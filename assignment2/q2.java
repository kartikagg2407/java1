package assignment2;

import java.util.Scanner;

public class q2 {
    static void find(int n , int a){
        int d = 0;
        while(n!=0){
            int s = n%10;
            n/=10;
            if (s==a){
                d++;
            }
        }
        System.out.println(d);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n ;
        n = sc.nextInt();
        int a =sc.nextInt();
        find(n, a);
        sc.close();
    }
}
