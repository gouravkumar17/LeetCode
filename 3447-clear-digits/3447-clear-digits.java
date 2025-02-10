class Solution {
    public String clearDigits(String s) {
        int n = s.length();
        String ans = "";
        int cnt = 0;
        for(int i=n-1;i>=0;i--){
            if(s.charAt(i)>='0' && s.charAt(i)<='9') cnt++;
            else if(cnt!=0) cnt--;
            else if(cnt==0) ans = s.charAt(i)+ans;
        }
        return ans;
    }
}