package assignment2;

import java.util.Scanner;

public class q5 {
    static int fibonacci(int n){
        int a = 0;
        int b = 1;
        for (int i=1 ; i<=n-1 ; i++){
            int c =a+b;
            a=b;
            b=c;
        }
        if (n==0){
            return 0;
        }
        return b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fibonacci(n));
        sc.close();
    }
}
