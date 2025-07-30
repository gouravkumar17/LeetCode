class Solution {
    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        int a = rec1[0];
        int b = rec1[1];
        int c = rec1[2];
        int d = rec1[3];

        int p = rec2[0];
        int q = rec2[1];
        int r = rec2[2];
        int s = rec2[3];

        if(a<r && b<s && c>p && d>q) return true;
        else return false;
    }
}