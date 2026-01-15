class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int currCnt = 0;
        int maxCnt = 0;
        for(int n:nums){
            if(n==1){
                currCnt++;
                maxCnt = Math.max(maxCnt,currCnt);
            }
            else{
                currCnt = 0;
            }
        }
        return maxCnt;
    }
}