class Solution {
    public int[] numberOfLines(int[] widths, String s) {
        int sum = 0;
        int l = 1;
        for(char c:s.toCharArray()){
            int i = widths[c-'a'];
            sum = sum+i;
            if(sum>100){
                l++;
                sum = widths[c-'a'];
            }
        }
        int a[] = new int[2];
        a[0] = l;
        a[1] = sum;
        return a;
    }
}