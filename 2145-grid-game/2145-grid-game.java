class Solution {
    public long gridGame(int[][] grid) {
        int n = grid[0].length;
        long pre1 = 0;
        for(int i=0;i<n;i++){
            pre1 = pre1+grid[0][i];
        }
        long m = Long.MAX_VALUE;
        long pre2 = 0;
        for(int i=0;i<n;i++){
            pre1 = pre1-grid[0][i];
            m = Math.min(m,Math.max(pre1,pre2));
            pre2 = pre2+grid[1][i];
        }
        return m;
    }
}