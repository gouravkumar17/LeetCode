class Solution {
    public int minZeroArray(int[] nums, int[][] queries) {
        int n = nums.length;
        int m = queries.length;
        int d[] = new int[n+1];
        for(int i=1;i<=n;i++){
            d[i] = 0;
        }
        int sum = 0;
        int pos = 0;
        for(int i=0;i<n;i++){
            while(sum+d[i]<nums[i]){
                if(pos==m) return -1;
                int s = queries[pos][0];
                int e = queries[pos][1];
                int v = queries[pos][2];
                pos++;
                if(e<i) continue;
                d[Math.max(s,i)] += v;
                d[(e)+1] -= v;
            }
            sum += d[i];
        }
        return pos;
    }
}