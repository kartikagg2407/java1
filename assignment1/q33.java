package assignment1;

public class q33 {
    public static void main(String[] args) {
        int n = 8 ; 
        for (int i=1 ; i<=n ; i++){
            for (int k=1 ; k<=n-i ; k++){
                System.out.print("\t");
            }
            for (int j=1 ; j<=i ; j++){
                if(j==i){
                    System.out.print("0\t");        
                }
                else{
                    System.out.print(n-i+j + "\t");
                }
            }
            for (int j=2 ; j<=i ; j++){
                System.out.print(n-j+1 + "\t");
            }
            System.out.println();
        }
    }
}
