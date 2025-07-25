class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int l = 0;
        int r = n-1;
        int lmax = Integer.MIN_VALUE;
        int rmax = Integer.MIN_VALUE;
        int ans = 0;
        while(l<r){
            lmax = Math.max(lmax,height[l]);
            rmax = Math.max(rmax,height[r]);
            //ans += (lmax<rmax) ? lmax-height[l++] : rmax-height[r--];
            if(lmax<rmax){
                ans += lmax-height[l];
                l++;
            }
            else{
                ans += rmax-height[r];
                r--;
            }
        }
        return ans;
    }
}