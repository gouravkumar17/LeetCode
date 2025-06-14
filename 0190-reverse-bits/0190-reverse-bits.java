public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int ans = 0;
        for(int i=1;i<=32;i++){
            ans = ans+(n&1);
            n = n>>1;
            if(i<=31){
                ans = ans<<1;
            }
        }
        return ans;
    }
}