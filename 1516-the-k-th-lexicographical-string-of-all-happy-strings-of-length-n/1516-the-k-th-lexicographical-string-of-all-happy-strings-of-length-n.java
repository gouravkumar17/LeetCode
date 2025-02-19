class Solution {
    String res = "";
    int cnt = 0;
    public String getHappyString(int n, int k) {
        build(n,k,new StringBuilder());
        return res;
    }
    public void build(int n,int k,StringBuilder sb){
        if(sb.length()==n){
            cnt++;
            if(cnt==k){
                res = sb.toString();
                return;
            }
        }
        int sbL = sb.length();
        if(sbL<n && cnt<k){
            for(char c='a';c<='c';c++){
                if(sbL==0 || sb.charAt(sbL-1)!=c){
                    sb.append(c);
                    build(n,k,sb);
                    sb.deleteCharAt(sbL);
                }
            }
        }
    }
}