class Solution {
    public int maxCount(int m, int n, int[][] ops) {
        int minR1 = m;
        int minR2 = n;
        for(int x[]:ops){
            minR1 = Math.min(minR1,x[0]);
            minR2 = Math.min(minR2,x[1]);
        }
        return minR1*minR2;
    }
}