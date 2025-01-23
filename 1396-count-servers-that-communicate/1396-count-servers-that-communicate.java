class Solution {
    public int countServers(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int row[] = new int[n];
        int col[] = new int[m];
        int total = 0;
        for(int i=0;i<n;i++){
            int count = 0;
            for(int j=0;j<m;j++){
                if(grid[i][j]==1){
                    row[i]++;
                    col[j]++;
                    total++;
                }
            }
        }
        int temp = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1 && row[i]==1 && col[j]==1) temp++;
            }
        }
        return total-temp;
    }
}