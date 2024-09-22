package day7;

public class maximumoccuring {
    static char maxoccur(String s){
        char ans = '*';
        int count = 0;
        int max = 0;
        for(int i=0 ; i<s.length()-2 ; i++){
            if (s.charAt(i) == s.charAt(i+1)){
                count += 1;
                if (count > max){
                    max = count;
                    ans = s.charAt(i);
                }
            }
            else count = 0;
        }
        return ans;
    }
    public static void main(String[] args) {
        String s = "aabbbbcccccccddddddddddd";
        System.out.println(maxoccur(s));
    }
}
