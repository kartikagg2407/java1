package oops;

public class home {
    public static void main(String[] args) {
        cat c1 = new cat();
        cat c2 = new cat(
            "kalu",
            "black",
            "chausie"
        );
        c1.catcall();
        c2.catcall();
        // System.out.println(c2.colour);
    } 
}
