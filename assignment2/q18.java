package assignment2;

import java.util.Scanner;

public class q18 {
    static int decimaltobinary(int n){
        int sum = 0;
        int count = 0;
        while (n!=0){
            sum += n%2 * Math.pow(10, count);
            count++;
            n /= 2;
        }
        return sum;
    }
    static int binarytodecimal(int n){
        int sum = 0;
        int count = 0;
        while (n!=0){
            sum += n%10 * Math.pow(2 , count);
            count++;
            n/=10;
        }
        return sum;
    }
    static int binarytooctal(int n){
        int sum = 0;
        int count =0;
        while (n!=0){
            int a = binarytodecimal(n%1000);
            sum += a*Math.pow(10, count);
            count++;
            n /= 1000;
        }
        return sum;
    }
    static int octaltobinary(int n){
        int sum = 0;
        int count = 0;
        while(n!=0){
            int a = decimaltobinary(n%10);
            sum += a * Math.pow(1000 , count);
            n /= 10;
            count++;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sn = sc.nextInt();
        int dn = sc.nextInt();
        int n = sc.nextInt();
        if ( sn==10 && dn==2){
        System.out.println(decimaltobinary(n));
        }
        else if ( sn==2 && dn==10){
            System.out.println(binarytodecimal(n));
        }
        else if ( sn==2 && dn==8){
            System.out.println(binarytooctal(n));
        }
        else if ( sn==10 && dn==8){
            System.out.println(binarytooctal(decimaltobinary(n)));
        }
        else if ( sn==8 && dn==2){
            System.out.println(octaltobinary(n));
        }
        else if ( sn==8 && dn==10){
            System.out.println(binarytodecimal(octaltobinary(n)));
        }
        else {
            System.out.println("Wrong Input");
        }
    }
}
