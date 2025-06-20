class Solution {
    public long minimumTime(int[] time, int totalTrips) {
        long l = 1;
        long r = (long)getMin(time)*totalTrips;
        while(l<=r){
            long m = l+(r-l)/2;
            long res = 0;
            for(int t:time){
                res = res+m/t;
                if(res>=totalTrips) break;
            }
            if(res<totalTrips) l = m+1;
            else r = m-1;
        }
        return l;
    }
    private int getMin(int time[]){
        int min = time[0];
        for(int t:time) if(t<min) min = t;
        return min;
    }
}