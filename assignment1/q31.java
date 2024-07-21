package assignment1;

public class q31 {
    public static void main(String[] args) {
        int n = 5 ; 
        for (int i=1 ; i<=n ; i++){
            for (int j=0 ; j<=n-1 ; j++){
                if (n-j==i){
                    System.out.print("*\t");
                }
                else{
                System.out.print(n-j + "\t");
                }
            }
            System.out.println();
        }
    }
}
