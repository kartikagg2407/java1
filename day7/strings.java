package day7;

public class strings {
    public static void main(String[] args) {
        // part 1
        // String s = "Hello";
        // String s1 = new String("Hello");
        // String s2 = s;
        // String s3 = new String(s);
        // char[] c = {'H','e','l','l','o'};
        // String s4 = new String(c);
        // System.out.println(s);
        // System.out.println(s1);
        // System.out.println(s2);
        // System.out.println(s3);
        // System.out.println(s4);
        // String s1 = "  tables  ";
        // s1 = s1.trim();
        // String s2 = "table";
        // System.out.println(s1);
        // System.out.println(s2);
        // System.out.println(s1.contains(s2));
        // String s3 = new String(s1);
        // String s4 = new String("table");
        String s1  = "11";
        String s2 = "123";
        // String s3 = s1+s2;
        String s4 = "";
        // System.out.prinln(s3);
        for (int i=1 ; i<=2 ; i++){
            s4 += s1.charAt(s1.length()-i) + s2.charAt(s2.length()-i);
            System.out.println(s4);
        }
        // System.out.println(s4);
    }
}
