class Solution {
    int ans[] = {-1,-1};
    int temp = Integer.MAX_VALUE;
    int p = 0;
    public void calPair(int n){
        if(n<=1) return;
        for(int i=2;i*i<=n;i++){
            if(n%i==0) return;
        }
        if(n-p<temp && p!=0){
            temp = n-p;
            ans[0] = p;
            ans[1] = n;
        }
        p = n;
    }
    public int[] closestPrimes(int left, int right) {
        for(int i=left;i<=right;i++){
            calPair(i);
            if(temp<=2) return ans;
        }
        return ans;
    }
}