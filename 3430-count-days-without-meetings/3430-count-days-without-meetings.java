class Solution {
    public int countDays(int days, int[][] meetings) {
        int n=meetings.length;
        if(n==1 && meetings[0][1]==days){
            return 0;
        }
        if(n==1 && meetings[0][1]!=days){
            return days-meetings[0][1];
        }
        Arrays.sort(meetings,(a,b) -> Integer.compare(a[0],b[0]));
        int count=0;
        int begin=meetings[0][0];
        int end=meetings[0][1];
        if(begin>1){
            count+=(begin-1);
        }
        for(int i=1;i<n;i++){
            if(meetings[i][0]-end>1){
                count+=(meetings[i][0]-end-1);
            }
            begin=Math.max(meetings[i][0],begin);
            end=Math.max(meetings[i][1],end);
        }
        if(end<days){
            count+=(days-end);
        }
        return count;
    }
}