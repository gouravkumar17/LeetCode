class Solution {
    static boolean isP(int n){
        if(n<=1) return false;
        for(int i=2;i<n;i++){
            if(n%i==0) return false;
        }
        return true;
    }
    public int hammingW(int n){
        int c = 0;
        while(n>0){
            if((n&1)==1) c++;
            n=n>>1;
        }
        return c;
    }
    public int countPrimeSetBits(int left, int right) {
        int ans = 0;
        int c = 0;
        boolean res = true;
        for(int i=left;i<=right;i++){
            ans = hammingW(i);
            res = isP(ans);
            if(res==true) c++;
        }
        return c;
    }
}