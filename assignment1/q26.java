package assignment1;

public class q26 {
    public static void main(String[] args) {
        int n = 5 ;
        for (int i=1 ; i<=n ; i++){
            int s=1;
            for (int k=1 ; k<=n-i ; k++){
                System.out.print("\t");
            }
            for (int j=1 ; j<=i ; j++){
                System.out.print(s + "\t");
                s++;
            }
            for (int j=2 ; j<=i ; j++){
                System.out.print(s + "\t");
                s++;
            }
            System.out.println();
        } 
    }
}
