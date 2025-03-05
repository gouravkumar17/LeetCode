class Solution {
    public long coloredCells(int n) {
        long sum = 1;
        for(int i=2;i<=n;i++){
            int res = (i-1)*4;
            sum = sum+res;
        }
        return sum;
    }
}