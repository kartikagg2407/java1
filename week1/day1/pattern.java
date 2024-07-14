package week1.day1;
import java.util.Scanner;
class  patternprinting{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n ;
        System.out.print("Enter the number of lines : ");
        n=sc.nextInt();
        for (int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print("*");
                sc.close();
            }
            System.out.println();
        }
    }
}
