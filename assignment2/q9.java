package assignment2;

import java.util.Scanner;

public class q9 {
    static void prime(int n){
        int a = 1 ;
        for (int i=3 ; i<=n ; i++){
            if (n%i==0){
                a++;
            }
        }
        if (a==2 || n==2){
            System.out.println("prime");
        }
        else{
            System.out.println("not prime");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        prime(n);
        sc.close();
    }
}
