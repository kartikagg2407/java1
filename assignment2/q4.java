package assignment2;

import java.util.Scanner;

public class q4 {
    static void lcm(int n1 , int n2){
        int i = 1;
        while (i!=0){
            int a = n1*i;
            System.out.println(a);
            if (a%n2==0){
                System.out.println(a);
                i=0;
            }
            else{
                i++;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        lcm(n1, n2);
        sc.close();
    }
}
