package day10Recursion;

public class factorial {
    static int fact(int n , int x){
        if (n == 1 || n == 0) return x;
        return fact(n-1 , n * x);
    }
    public static void main(String[] args) {
        System.out.print(fact(5,1));
    }
}
