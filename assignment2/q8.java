package assignment2;

import java.util.Scanner;

public class q8 {
    static void series(int n1 , int n2){
        int i = 1;
        int s = 1;
        while(s<=n1){
            int b = (3*i)+2;
            if ( b % n2 != 0){
                System.out.println(b);
                s++;
            }
            i++;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        System.out.println();
        series(n1, n2);
        sc.close();
    }
}
