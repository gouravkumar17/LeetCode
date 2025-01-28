class Solution {
    int sum = 0;
    public int dfs(int i, int j, int[][] grid){
        if(i<0 || j<0 || i>=grid.length || j>=grid[0].length || grid[i][j]==0){
            return sum;
        }
        else{
            sum+=grid[i][j];
            grid[i][j]=0;
            dfs(i+1,j,grid);
            dfs(i-1,j,grid);
            dfs(i,j+1,grid);
            dfs(i,j-1,grid);
        }
        return sum;
    }
    public int findMaxFish(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int max = 0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]>0){
                    sum = 0;
                    max = Math.max(max,dfs(i,j,grid));
                }
            }
        }
        return max;
    }
}