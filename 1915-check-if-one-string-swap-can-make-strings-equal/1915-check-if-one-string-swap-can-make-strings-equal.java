class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        int n = s1.length();
        int f = -1;
        int s = -1;
        int cnt = 0;
        for(int i=0;i<n;i++){
            if(s1.charAt(i)!=s2.charAt(i)){
                cnt++;
                if(f==-1) f = i;
                else if(s==-1) s = i;
            }
        }
        if(cnt==0) return true;
        else if(cnt==2 && s1.charAt(f)==s2.charAt(s) && s1.charAt(s)==s2.charAt(f)) return true;
        return false;
    }
}