class Solution {
    public int trapRainWater(int[][] heightMap) {
        if (heightMap == null || heightMap.length == 0 || heightMap[0].length == 0) {
            return 0;
        }
        int m = heightMap.length;
        int n = heightMap[0].length;
        boolean[][] visited = new boolean[m][n];
        PriorityQueue<int[]> minHeap = new PriorityQueue<>((a, b) -> Integer.compare(a[0], b[0]));
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == m - 1 || j == 0 || j == n - 1) {
                    minHeap.offer(new int[]{heightMap[i][j], i, j});
                    visited[i][j] = true;
                }
            }
        }
        int waterTrapped = 0;
        int[][] directions = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}}; // down, up, right, left
        while (!minHeap.isEmpty()) {
            int[] current = minHeap.poll();
            int height = current[0];
            int x = current[1];
            int y = current[2];
            for (int[] dir : directions) {
                int newX = x + dir[0];
                int newY = y + dir[1];
                if (newX >= 0 && newX < m && newY >= 0 && newY < n && !visited[newX][newY]) {
                    if (heightMap[newX][newY] < height) {
                        waterTrapped += height - heightMap[newX][newY];
                    }
                    minHeap.offer(new int[]{Math.max(height, heightMap[newX][newY]), newX, newY});
                    visited[newX][newY] = true;
                }
            }
        }
        return waterTrapped;
    }
}