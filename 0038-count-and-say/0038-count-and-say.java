class Solution {
    public String RES(String s){
        int n = s.length();
        String res = "";
        int i = 0;
        while(i<n){
            int count = 1;
            while(i+1<n && s.charAt(i)==s.charAt(i+1)){
                count++;
                i++;
            }
            res += Integer.toString(count);
            res += s.charAt(i);
            i++;
        }
        return res;
    }
    public String countAndSay(int n) {
        if(n==1) return "1";
        String p = countAndSay(n-1);
        String res = RES(p);
        return res;
    }
}