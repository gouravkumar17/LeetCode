class Solution {
    public int maxScore(String s) {
        int t = 0;
        for(char c:s.toCharArray()){
            if(c=='1') t++;
        }
        int mS = 0;
        int l = 0;
        int r = t;
        int n = s.length();
        for(int i=0;i<n-1;i++){
            if(s.charAt(i)=='0') l++;
            else r--;
            mS = Math.max(mS,l+r);
        }
        return mS;
    }
}