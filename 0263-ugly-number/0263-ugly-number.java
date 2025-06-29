class Solution {
    public boolean isUgly(int n) {
        if(n<=0) return false;
        int fac[] = {2,3,5};
        for(int f:fac){
            while(n%f==0) n = n/f;
        }
        return n==1;
    }
}