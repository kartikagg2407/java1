package day8;

public class twoDarray {
    static void display(int[][] nums){
        for (int[] i:nums){
            for (int j:i){
                System.out.print(j + "\t");
            }
            System.out.println();
        }
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
        display(nums);
        // int[] arr = {1,2,3,4,5};
        // int[][] nums = {
        //     {1,2,3,4},
        //     {5,6,7,8},
        //     {9,10,11,12},
        //     arr,
        // };
        // int[] arr1 = new int[5];
        // System.out.println(nums[3][4]);
        // System.out.println(nums[1]);
        // System.out.println(nums[2]);
        // int[][][] nums = new int[3][4][5];
        // int[][][][][] grid = new int[2][3][4][2][1];
        // System.out.println(grid);
    }
}
