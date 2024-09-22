package day8;

public class sort {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder(10);
        // sb.append("Hello");
        // sb.insert(2,6.0);
        // sb.delete(2 , 5); // to delete a substring
        sb.ensureCapacity(20); // makes a new array of size 100 and address of new array stored in sb
        // sb.append("Bye");
        // sb.reverse(); // to reverse string
        // sb.replace(0 , 3 , " replaced ");
        // System.out.println(sb);
        System.out.println(sb.capacity()); // capacity = 2(currentcapacity + new blocks)
    }
}
