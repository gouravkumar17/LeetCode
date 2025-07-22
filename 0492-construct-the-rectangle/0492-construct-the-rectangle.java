class Solution {
    public int[] constructRectangle(int area) {
        int b = (int)Math.sqrt(area);
        while(area%b!=0) b--;
        int l = area/b;
        return new int[]{l,b};
    }
}