class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n = nums.length;
        int low = 0;
        int high = n-1;
        if(n==0) return new int[] {-1,-1};
        int res[] = new int[2];
        while(low<high){
            int mid = low+(high-low)/2;
            if(nums[mid]<target) low = mid+1;
            else high = mid;
        }
        if(nums[low]!=target) return new int[] {-1,-1};
        res[0] = low;
        high = n;
        while(low<high){
            int mid = low+(high-low)/2;
            if(nums[mid]<=target) low = mid+1;
            else high = mid;
        }
        res[1] = low-1;
        return res;
    }
}