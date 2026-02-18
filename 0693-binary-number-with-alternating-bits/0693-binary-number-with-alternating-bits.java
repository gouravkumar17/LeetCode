class Solution {
    public boolean hasAlternatingBits(int n) {
        int v = n&1;
        while(n!=0){
            n=n>>1;
            if(v==(n&1)) return false;
            v = n&1;
        }
        return true;
    }
}