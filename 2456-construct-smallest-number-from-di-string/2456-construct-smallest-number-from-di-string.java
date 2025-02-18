class Solution {
    public String smallestNumber(String pattern) {
        StringBuilder ans = new StringBuilder();
        int l = 0;
        int r = 0;
        char p[] = pattern.toCharArray();
        int n = p.length;
        for(int i=0;i<n;i++){
            if(p[i]=='I'){
                for(int num = r+1;num>l;num--) ans.append(num);
                l = r+1;
                r = r+1;
            }
            else r += 1;
        }
        for(int num=r+1;num>l;num--) ans.append(num);
        return ans.toString();
    }
}