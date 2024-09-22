package day10Recursion;

public class parenthesis {
    static void generateparenthesis(
        int n ,
        String ans , 
        int l , 
        int r
        ){
            if (l == n && r == n){
                System.out.println(ans);
                return ;
            }
            if (l < n)
                generateparenthesis(n, ans + "{", l + 1, r);
            if (r < l)
                generateparenthesis(n, ans + "}", l, r + 1);
        }
    public static void main(String[] args) {
        generateparenthesis(3, "", 0, 0);
    }
}
