package assignment2;

import java.util.Scanner;

public class q17 {
    static int primeSum(int n){
        int a = n ; 
        int sumP = 0;
        while(a%2==0){
            sumP += 2;
            a /= 2;
        }
        for (int i=3 ; i<Math.sqrt(a) ; i += 2){
            while(a%i==0){
                int j = i;
                while(j!=0){
                    sumP += j%10;
                    j /= 10;
                }
                a /= i;
            }
            if (a==1) break;
        }
        if (a>2){
            while(a!=0){
                sumP += a%10;
                a /= 10;
            }
        }
        return sumP;
    }
    static int digitSum (int n){
        int sums = 0;
        while (n!=0){
            sums += n%10;
            n /= 10;
        }
        return sums;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (primeSum(n) == digitSum(n)) System.out.println(1);
        else System.out.println(0);
    }
}
// 2,147,483,647