package day7;

public class reverse {
    static String swap (String s){
        String c = "";
        for (int i=s.length()-1 ; i>=0 ; i--){
            c += s.charAt(i);
        }
        return c;
    }
    public static void main(String[] args) {
        String s = "potato";
        System.out.println(swap(s));
    }
}
