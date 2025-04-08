class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        int n = nums.length;
        int num[] = new int[n+1];
        int dis = 0;
        int s = 0;
        int minE = 0;
        int total = 0;
        while(dis==k || minE<n){
            while(dis<k && minE<n) if(num[nums[minE++]]++ == 0) dis++;
            int maxE = minE;
            while(maxE<n && num[nums[maxE]]>0) maxE++;
            while(dis==k){
                if(num[nums[s++]]-- == 1) dis--;
                total += (maxE-minE+1);
            }
        }
        return total;
    }
}