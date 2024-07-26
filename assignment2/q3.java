package assignment2;

import java.util.Scanner;

public class q3 {
    static void binarytodecimal(int n){
        int s = 0;
        int a = 0;
        while (n!=0){
            int b = n%10;
            s = s + b*(int)Math.pow(2, a);
            a++;
            n/=10;
        }
        System.out.println(s);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        binarytodecimal(n);
        sc.close();
    }
}
