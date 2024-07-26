package assignment1;
public class q34 {
    public static void main(String[] args) {
        int n = 5 ;
        int a = n-2; 
        for (int i=1 ; i<=n ; i++){
            for (int j=1 ; j<=i && j <n ; j++){
                System.out.print("* ");
            }
            for (int k = 1 ; k<=n-i-1 ; k++){
                System.out.print("    ");
            }
            for (int j=1 ; j<=i && j <n ; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i=1 ; i<=a ; i++){
            for (int j=a ; j>=i ; j--){
                System.out.print("* ");
            }
            for (int k=1 ; k<=i ; k++){
                System.out.print("    ");
            }
            for (int j=a ; j>=i ; j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
          