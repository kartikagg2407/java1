package assignment2;

import java.util.Scanner;

public class q16 {
    static void shopping(int n , int m){
        int a = 1;
        int b = 2;
        int suma = a;
        int sumb = b;
        for (int i=1 ; i<=Math.pow(10,6) ; i++){
            a += 2;
            suma += a;
            b += 2;
            sumb += b;
            if (suma > n){ 
                System.out.println("Harshit");
                break;
            }
            else if(sumb > m){
                System.out.println("Aayush");
                break;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        for (int i=1 ; i<=n1 ; i++){
            int n = sc.nextInt();
            int m = sc.nextInt();
            shopping(n, m);
        }
    }
}
