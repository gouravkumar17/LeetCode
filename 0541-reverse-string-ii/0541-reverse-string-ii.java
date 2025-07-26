class Solution {
    private void rev(char ch[],int s,int e){
        while(s<e){
            char t = ch[s];
            ch[s] = ch[e];
            ch[e] = t;
            s++;
            e--;
        }
    }
    public String reverseStr(String s, int k) {
        char ch[] = s.toCharArray();
        int n = ch.length;
        for(int i=0;i<n;i+=2*k){
            int st = i;
            int e = Math.min(i+k-1,n-1);
            rev(ch,st,e);
        }
        return new String(ch);
    }
}