class Solution {
    public static int MOD = 1_000_000_007;
    public int countGoodNumbers(long n) {
        long eC = (n+1)/2;
        long oC = n/2;
        long eP = mod(5,eC);
        long oP = mod(4,oC);
        return (int)((eP*oP)%MOD);
    }
    private long mod(long b,long ex){
        long res = 1;
        b %= MOD;
        while(ex>0){
            if((ex&1)==1) res = (res*b)%MOD;
            b = (b*b)%MOD;
            ex >>= 1;
        }
        return res;
    }
}