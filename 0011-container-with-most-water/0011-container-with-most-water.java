class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int l = 0;
        int r = n-1;
        int maxA = 0;
        while(l<r){
            int w = r-l;
            int minH = Math.min(height[l],height[r]);
            int a = minH*w;
            maxA = Math.max(maxA,a);
            if(height[l]<height[r]) l++;
            else if(height[l]>height[r]) r--;
            else{
                l++;
                r--;
            }
        }
        return maxA;
    }
}