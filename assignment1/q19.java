package assignment1;

public class q19 {
    public static void main(String[] args) {
        int n = 7 ;
        int a = (n+1)/2 ; 
        for (int i=a ; i>=1 ; i--){
            for (int j=1 ; j<=i ; j++){
                System.out.print("* ");
            }
            for (int k=1 ; k<=a-i ; k++){
                System.out.print("  ");
            }
            for (int k=2 ; k<=a-i  ; k++){
                System.out.print("  ");
            }
            for (int j=1 ; j<=i && j<a; j++){
                System.out.print("* ");
            }
            System.out.println();
        }   
        for (int i=2 ; i<=a ; i++){
            for (int j=1 ; j<=i ; j++){
                System.out.print("* ");
            }
            for (int k=a ; k>=i+1 ; k--){
                System.out.print("  ");
            }
            for (int k=a-1 ; k>=i+1 ; k--){
                System.out.print("  ");
            }
            for (int j=1 ; j<=i && j<=a-1; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }   
}
