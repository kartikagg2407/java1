package day3.day3;
public class function5 {
    static int digits(int n){
        int s=0;
        for (int i=1 ; i<=n*10 ; i++){
            n/=10;
            s++;
        }
        return s;
    }
    public static void main(String[] args) {
        int n =12830;
        System.out.println(digits(n));
    }
}
