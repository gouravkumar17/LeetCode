class Solution {
    public int findNumbers(int[] nums) {
        int c = 0;
        for(int num:nums){
            if(isV(num)) c++;
        }
        return c;
    }
    private boolean isV(int n){
        int c = 0;
        while(n>0){
            c++;
            n = n/10;
        }
        return c%2==0;
    }
}