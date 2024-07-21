package assignment1;

public class q32 {
    public static void main(String[] args) {
        int n = 5 ; 
        for (int i=1 ; i<=n ; i++){
            for (int j=1 ; j<=2*i-1 ; j++){
                if (j%2==0){
                    System.out.print("*\t");
                }
                else{
                    System.out.print(i + "\t");
                }
            }
            System.out.println();
        }
        for (int i=n-1 ; i>=1 ; i--){
            for (int j=1 ; j<=2*i-1 ; j++){
                if (j%2==0){
                    System.out.print("*\t");
                }
                else{
                    System.out.print(i + "\t");
                }
            }
            System.out.println();
        }
    }
}
