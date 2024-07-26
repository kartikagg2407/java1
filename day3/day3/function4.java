package day3.day3;
public class function4 {
    static int rev(int n){
        int s=0;
        for (int i=1 ; i<=n*10 ; i++){
            if (n!=0){
                s=s*10 + n%10;
                n=n/10;
            }
        
        }
        return s;
    }
    public static void main(String[] args) {
        int n=6750;
        System.out.println(rev(n));
    }
}
