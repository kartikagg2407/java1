package day5;

public class nge {
    static int[] nger(int[] arr){
        int maxelement = 0;
        int[] nger = new int[arr.length];
        for (int i=arr.length-1 ; i>=0 ; i--){
            nger[i] = maxelement;
            maxelement = Math.max(arr[i] , maxelement);
        }
        return nger;
    }
    static int[] ngel(int[] arr){
        int maxelement = 0;
        int[] ngel = new int[arr.length];
        for (int i=0 ; i<arr.length ; i++){
            ngel[i] = maxelement;
            maxelement = Math.max(arr[i] , maxelement);
        }
        return ngel;
    }
    public static void main(String[] args) {
        int[] n = {3,7,2,5,8,4,9,1,6};
        int[] nger = nger(n);
        int[] ngel = ngel(n);
        for (int i:ngel){
            System.out.print(i + " ");
        }
    }
}
