class Solution {
    public boolean isPowerOfFour(int n) {
        boolean f = true;
        for(int i=0;i<100;i++){
            long v = (long)Math.pow(4,i);
            if(v==n) return true;
        }
        return false;
    }
}