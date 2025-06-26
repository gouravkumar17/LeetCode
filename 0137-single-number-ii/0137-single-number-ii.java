class Solution {
    public int singleNumber(int[] nums) {
        int res = 0;
        for(int i=0;i<32;i++){
            int s = 0;
            for(int n:nums){
                s = s+((n>>i)&1);
            }
            s = s%3;
            res = res | (s<<i);
        }
        return res;
    }
}