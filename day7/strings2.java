package day7;

public class strings2 {
    public static void main(String[] args) {
        // part1
        // String s1 = "This is a class";
        // // s1 = s1.replace("aditya", "ankit");
        // String s2 = "";
        // System.out.println(s1);
        // System.out.println(s2.isEmpty());
        // 

        //  part2
        // String s1 = "This\tis\ta\tclass";
        // String s2 = "This is line 1.\\This is line 2. ";
        // String s3 = "Girl \frule ";
        // System.out.println(s2);
        // System.out.println(s3);

        // part3 split function
        // String s1 = "Hi, this is an example string";
        // String[] arr = s1.split("\\s" , 3);
        // for (String i:arr){
        //     System.out.println(i);
        // }


        // part4 String Intern
        // String s1 = "hello";
        // String s2 = "hello";
        // String s3 = new String("hello").intern();
        // String s4 = "hello";
        // String s5 = new String("hello").intern();
        // System.out.println(s4==s3);


        // part5 value of 
        double n = 5.4676;
        String s = String.valueOf(n);
        System.out.println(s);
    }
}
