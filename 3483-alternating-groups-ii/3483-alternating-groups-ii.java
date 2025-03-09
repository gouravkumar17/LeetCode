class Solution {
    public int numberOfAlternatingGroups(int[] colors, int k) {
        int res = 0;
        int l = 0;
        int n = colors.length;
        for(int i=1;i<(n+k-1);i++){
            if(colors[i%n]==colors[(i-1)%n]){
                l = i;
            }
            if(i-l+1==k){
                res++;
                l++;
            }
        }
        return res;
    }
}