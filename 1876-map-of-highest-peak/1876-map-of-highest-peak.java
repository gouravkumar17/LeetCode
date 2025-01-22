class Solution {
    public int[][] highestPeak(int[][] isWater) {
        int n = isWater.length;
        int m = isWater[0].length;
        int ans[][] = new int[n][m];
        Queue<int[]> pq = new LinkedList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(isWater[i][j]==1) pq.offer(new int[] {i,j});
                else ans[i][j] = -1;
            }
        }
        int d[][] = {{0,1},{0,-1},{1,0},{-1,0}};
        int count = 1;
        while(!pq.isEmpty()){
            int size = pq.size();
            for(int i=1;i<=size;i++){
                int a[] = pq.poll();
                for(int di[]:d){
                    int x = a[0]+di[0];
                    int y = a[1]+di[1];
                    if(x>=0 && x<n && y>=0 && y<m && ans[x][y]==-1){
                        ans[x][y] = count;
                        pq.offer(new int[] {x,y});
                    }
                }
            }
            count++;
        }
        return ans;
    }
}