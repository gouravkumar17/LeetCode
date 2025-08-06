class Solution {
    public boolean isBoomerang(int[][] points) {
        int abE[] = new int[2];
        int acE[] = new int[2];
        abE[0] = points[1][0] - points[0][0];
        abE[1] = points[1][1] - points[0][1];
        acE[0] = points[2][0] - points[0][0];
        acE[1] = points[2][1] - points[0][1];
        return (abE[0]*acE[1] - abE[1]*acE[0]) != 0;
    }
}