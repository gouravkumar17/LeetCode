class Solution {
    public long get(int[] weights, int k) {
        int n = weights.length;
        int s[] = new int[n-1];
        for(int i=0;i<n-1;i++){
            s[i] = weights[i+1]+weights[i];
        }
        Arrays.sort(s);
        long ans = 0;
        for(int i=n-2;i>=n-k;i--) ans = ans+s[i];
        return ans;
    }
    public long putMarbles(int[] weights, int k) {
        int n = weights.length;
        if(k==1) return 0;
        long maxS = get(weights,k);
        for(int i=0;i<n;i++) weights[i] = -weights[i];
        long minS = -1*get(weights,k);
        return maxS-minS;
    }
}