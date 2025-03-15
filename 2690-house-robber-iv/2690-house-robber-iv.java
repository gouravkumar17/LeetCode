class Solution {
    public int minCapability(int[] nums, int k) {
        int n = nums.length;
        int mx = Integer.MIN_VALUE;
        int mn = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            mn = Math.min(mn,nums[i]);
            mx = Math.max(mx,nums[i]);
        }
        int l = mn;
        int h = mx;
        int ans = 0;
        while(l<=h){
            int mid = l+(h-l)/2;
            if(valid(nums,mid,k)){
                ans = mid;
                h = mid-1;
            }
            else l = mid+1;
        }
        return ans;
    }
    public boolean valid(int nums[],int mid,int k){
        int n = nums.length;
        int c = 0;
        int i = 0;
        while(i<n){
            if(nums[i]<=mid){
                c++;
                i = i+2;
            }
            else i++;
            if(c==k) return true;
        }
        return false;
    }
}