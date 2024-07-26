package day3.day3;
public class function4 {
    static int rev(int n){
        int s=0;
        while(n!=0){
            s = s*10 + n%10 ;
            n /= 10 ;
        }
        return s;
    }
    public static void main(String[] args) {
        int n=321544765;
        System.out.println(rev(n));
    }
}
