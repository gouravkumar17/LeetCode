class Solution {
    public int jump(int[] nums) {
        int n = nums.length;
        int s = 0;
        int e = 0;
        int m = 0;
        for(int i=0;i<n-1;i++){
            m = Math.max(m,i+nums[i]);
            if(i==e){
                s++;
                e=m;
            }
        }
        return s;
    }
}