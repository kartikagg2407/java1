package day8;

public class transpose {
    static void transpose(int[][] nums){
        // int[][] arr = new int[nums[0].length][nums.length];
        for(int i=0 ; i<nums.length ; i++){
            for (int j=0 ; j<i ; j++){
                int temp = nums[i][j];
                nums[i][j] = nums[j][i];
                nums[j][i] = temp;
                
            }
        }
        // return arr;
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
    static void display(int[][] nums){
        for (int[] i:nums){
            for (int j:i){
                System.out.print(j + "\t");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[][] nums = new int[4][4];
        populate(nums);
        transpose(nums);
        display(nums);
    }
}
