package day3.day3;
public class function {
    static void swap(int a , int b){
        int c=a;
        a=b;
        b=c;
        System.out.println(a);
        System.out.println(b);
    }
    public static void main(String[] args) {
        swap(5, 4);
    }
}
