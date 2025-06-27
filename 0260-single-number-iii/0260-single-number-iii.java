class Solution {
    public int[] singleNumber(int[] nums) {
        int ans = 0;
        for(int n:nums) ans = ans^n;
        ans = ans & (-ans);
        int res[] = new int[2];
        for(int n:nums){
            if((ans&n)==0) res[0] = res[0]^n;
            else res[1] = res[1]^n;
        }
        return res;
    }
}