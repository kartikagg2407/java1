package day5;

public class rotatearray {
    public void rotateone(int[] arr){
        int a = arr[arr.length-1];
        for (int i=arr.length-1; i>0 ; i--){
            arr[i] = arr[i-1];
        }
        arr[0] = a;
    }
    public void reverse(int[] nums , int start , int end){
        while (start<end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
    public void rotate(int[] nums, int k) {
        int[] temp = new int[nums.length];
        k %= nums.length;
        // for (int i=0 ; i<nums.length-k ; i++){
        //     temp[k+i] = nums[i];
        // }
        // for (int i=0 ; i<k ; i++){
        //     temp[i] = nums[nums.length-k+i];
        // }
        // for (int i=0 ; i<nums.length ; i++){
        //     nums[i] = temp[i];
        // }
        reverse(nums,0,nums.length-1);
        reverse(nums,0,k-1);
        reverse(nums,k,nums.length-1);
    }
}
