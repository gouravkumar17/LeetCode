class Solution {
    public int largestAltitude(int[] gain) {
        int n = gain.length;
        int sum = 0;
        int res = 0;
        for(int i=0;i<n;i++){
            sum += gain[i];
            res = Math.max(res,sum);
        }
        return res;
    }
}