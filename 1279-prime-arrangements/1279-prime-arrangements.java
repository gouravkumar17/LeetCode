class Solution {
    int M = (int)1e9 +7;
    public boolean isP(int n){
        if(n==2) return true;
        else if(n%2==0) return false;
        int l = (int)Math.sqrt(n);
        for(int i=3;i<=l;i+=2){
            if(n%i==0) return false;
        }
        return true;
    }
    public long fact(int n){
        long m = 1;
        for(int i=2;i<=n;i++){
            m = (m*i)%M;
        }
        return m;
    }
    public int numPrimeArrangements(int n) {
        int c = 0;
        for(int i=2;i<=n;i++){
            if(isP(i)) c++;
        }
        int x = n-c;
        long f1 = fact(c)%M;
        long f2 = fact(x)%M;
        return (int)((f1*f2)%M);
    }
}