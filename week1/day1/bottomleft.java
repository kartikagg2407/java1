package week1.day1;

public class bottomleft {
    public static void main(String[] args) {
        int n = 5 ;
        for (int i=n ;i>=1;i--){
            for(int k = 1 ; k<=n-i; k++){
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}