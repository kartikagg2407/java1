public class function6 {
    static int digits(int n){
        int s=0;
        for (int i=1 ; i<=n*10 ; i++){
            n/=10;
            s++;
        }
        return s;
    }
    static boolean arm(int n){
        int a = digits(n);
        int b = n;
        int sum = 0;
        while (n!=0){
            sum += Math.pow((n%10),a);
            n/=10;
        }
        return sum==b;
    }

    public static void main(String[] args) { 
        System.out.println(arm(12));
    }
}
