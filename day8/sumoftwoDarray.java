package day8;

public class sumoftwoDarray {
    static int sum(int[][] nums){
        int sum = 0;
        for (int[] i:nums){
            for (int j:i){
                sum += j;
            }
        }
        return sum;
    }
    static void populate(int[][] nums){
        int n = 1;
        for (int i=0 ; i<nums.length ; i++){
            for (int j=0 ; j<nums[0].length ; j++){
                nums[i][j] = n;
                n++;
            }
        }
    }
    public static void main(String[] args) {
        int[][] nums = new int[3][4];
        populate(nums);
        int n = sum(nums);
        System.out.println(n);
    }
}
