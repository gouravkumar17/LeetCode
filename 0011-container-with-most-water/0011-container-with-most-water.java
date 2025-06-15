class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int maxA = 0;
        int l = 0;
        int r = n-1;
        while(l<r){
            int c = Math.min(height[l],height[r]);
            int res = (r-l)*c;
            maxA = Math.max(maxA,res);
            if(height[l]<height[r]) l++;
            else r--;
        }
        return maxA;
    }
}