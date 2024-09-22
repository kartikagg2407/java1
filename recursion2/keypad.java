

public class keypad {
    static String[] arr = {"" , "" , "abc" , "def" , "ghi" , "jkl" , "mno" , "pqrs" , "tuv" , "wxyz"};
    static void key(String n , String ans){
        if (n.length() == 0){
            System.out.println(ans);
            return;
        }
        char ch = n.charAt(0);
        String press = arr[ch - '0'];
        for (int i=0 ; i<press.length() ; i++){
            key(n.substring(1), ans + press.charAt(i));
        }
    }
    public static void main(String[] args) {
        String n = "245";
        String ans = "";
        key(n, ans);
    }
}
