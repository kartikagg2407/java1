package day10Recursion;

public class power {
    static int pow(int a , int b , int i){
        if (b == 0) return i;
        // int x = a * pow(a , b-1);
        return pow(a, b-1, a*i);
    }
    public static void main(String[] args) {
        int i = 1;
        System.out.println(pow(2 , 10 , i));
        System.out.println(Integer.MAX_VALUE);
    }
}
