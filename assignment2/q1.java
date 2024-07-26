package assignment2;

import java.util.Scanner;

public class q1 {
    static void sum(int n){

        int s = 0;
        int sum1 = 0;
        int sum2 = 0;
        while (n!=0){
            int a = n%10;
            n/=10;
            s++;
            if (s%2==0){
                sum2+=a;
            }
            else{
                sum1+=a;
            }
        }
        System.out.println(sum1);
        System.out.println(sum2);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n=sc.nextInt();
        sum(n);
        sc.close();
    }
}
