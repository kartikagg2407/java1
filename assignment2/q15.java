package assignment2;

import java.util.Scanner;

public class q15 {
    static void oddEven(int n){
        int sume = 0;
        int sumo = 0;
        while(n!=0){
            int a = n%10;
            if (a%2==0) sume += a;
            else sumo += a;
            n /= 10 ;
        }
        if ( sume % 4 == 0 || sumo % 3 == 0) System.out.println("yes");
        else System.out.println("no");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i=1 ; i<=n ; i++){
            int no = sc.nextInt();
            oddEven(no);
        }
        sc.close();
    }
}
