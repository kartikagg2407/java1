package day5;

public class kadane {
    static int maxsubarray(int[] arr){
        int maxsum = Integer.MIN_VALUE;
        int currsum = 0;
        for (int i:arr){
            currsum += i;
            maxsum = Math.max(maxsum , currsum);
            if (currsum<0) currsum = 0;
        }
        return maxsum;
    }
    public static void main(String[] args) {
        int[] arr = {-2,-5,6,8,3,-10,6,3,67,-88};
        System.out.println(maxsubarray(arr));
    }
}
