class Solution {
    public boolean isSubsequence(String s, String t) {
        int n = s.length();
        int m = t.length();
        if(n==0) return true;
        if(n>m) return false;
        int p = 0;
        for(int i=0;i<m;i++){
            if(s.charAt(p)==t.charAt(i)) p++;
            if(p==n) return true;
        }
        return false;
    }
}