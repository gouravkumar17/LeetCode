class Solution {
    public int subarraySum(int[] nums, int k) {
        int n = nums.length;
        int sum[] = new int[n+1];
        int c = 0;
        sum[0] = 0;
        for(int i=1;i<=n;i++) sum[i] = sum[i-1]+nums[i-1];
        int s = sum.length;
        for(int i=0;i<s;i++){
            for(int j=i+1;j<s;j++){
                if(sum[j]-sum[i]==k) c++;
            }
        }
        return c;
    }
}