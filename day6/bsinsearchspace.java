package day6;

public class bsinsearchspace {
    static boolean check(int mid , int dist , int time){
        int a = mid * time;
        return a>=dist;
    }
    static int speed(int dist , int time){
        int low = 0;
        int ans = -1;
        int high = 100;
        while (low<=high){
            int mid = high - (high-low)/2;
            if (check(mid, dist , time)){
                ans = mid;
                high = mid - 1;
            }
            else low = mid + 1;
        }
        return ans;
    }
    public static void main(String[] args) {
        int dist = 50;
        int time = 2;
        System.out.println(speed(dist, time));
    }
}
