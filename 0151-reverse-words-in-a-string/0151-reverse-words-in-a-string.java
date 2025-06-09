class Solution {
    public String reverseWords(String s) {
        String str[] = s.trim().split("\\s+");
        int n = str.length;
        String ans = "";
        for(int i=n-1;i>0;i--) ans += str[i]+" ";
        String res = ans+str[0];
        return res;
    }
}