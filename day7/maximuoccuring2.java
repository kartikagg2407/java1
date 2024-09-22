package day7;

public class maximuoccuring2 {
    static char maxoccur(String s){
        // char ans = 'a';
        int max = 0;
        s = s.toLowerCase();
        int[] arr = new int[26];
        for (int i=0 ; i<s.length(); i++){
            arr[s.charAt(i) - 'a']++;
        }
        for (int i=0 ; i<arr.length ; i++){
            if (arr[max]<=arr[i]) max=i;
        }
        return (char)('a'+max);
    }
    public static void main(String[] args) {
        String s = "aaaabbbbcc";
        System.out.println(maxoccur(s));
    }
}
