package day3.day3;
public class function3 {
    static boolean prime(int n){
        int a = 0;
        for (int i = 1 ; i<=n ; i++){
            if (n%i==0){
                a++;
            }
        }
        if (a<=2){
            return(true); 
        }
        else{
            return(false);
        }
    }
    public static void main(String[] args) {
        int n=5;
        System.out.println(prime(n) + "\n\n");
    }
}
