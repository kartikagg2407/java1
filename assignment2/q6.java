package assignment2;

import java.util.Scanner;

public class q6 {
    static void celsius(int n1 , int n2 , int n3){
        System.out.println(n1 + " " + 5*(n1-32)/9);
        while (n1<n2){
            n1+=n3;
            System.out.println(n1 + " " + 5*(n1-32)/9);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        celsius(n1, n2, n3);
        sc.close();
    }
}
