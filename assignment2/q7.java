package assignment2;

import java.util.Scanner;

public class q7 {
    static int reverse(int n){
        int s = 0;
        int a = 0;
        while (n!=0){
            a++;
            int b = n%10 - 1;
            s = s + a*(int)Math.pow(10, b);
            n/=10;
        }
        return s;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(reverse(n));
        sc.close();
    }
}
