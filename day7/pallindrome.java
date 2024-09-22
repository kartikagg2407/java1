package day7;

public class pallindrome {
    static boolean pallindromE(String s){
        int low = 0 , high = s.length() - 1;
        int count = 0;
        while (low<=high){
            if (s.charAt(low) == s.charAt(high)) count += 1;
            low++;
            high--;
        }
        return count == low;
    }
    public static void main(String[] args) {
        String s = "";
        System.out.println(pallindromE(s));
    }
}
