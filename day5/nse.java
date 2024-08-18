package day5;

public class nse {
    static int[] nser (int[] arr){
        int[] nser = new int[arr.length];
        int minelement = Integer.MAX_VALUE;
        for (int i=arr.length-1 ; i>=0 ; i--){  
            if (minelement == Integer.MAX_VALUE) nser[i] = 0;     
            else nser[i] = minelement;
            minelement = Math.min(minelement, arr[i]);
        }
        return nser;
    }
    static int[] nsel (int[] arr){
        int[] nsel = new int[arr.length];
        int minelement = Integer.MAX_VALUE;
        for (int i=0 ; i<arr.length ; i++){  
            if (minelement == Integer.MAX_VALUE) nsel[i] = 0;     
            else nsel[i] = minelement;
            minelement = Math.min(minelement, arr[i]);
        }
        return nsel;
    }
    public static void main(String[] args) {
        int[] n = {3,7,2,5,8,4,9,1,6};
        int[] nser = nser(n);
        int[] nsel = nsel(n);
        for (int i : nsel){
            System.out.print(i + " ");
        }
    }
}
