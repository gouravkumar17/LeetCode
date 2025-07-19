class Solution {
    public String reverseVowels(String s) {
        char w[] = s.toCharArray();
        int st = 0;
        int ed = s.length()-1;
        String v = "aeiouAEIOU";
        while(st<ed){
            while(st<ed && v.indexOf(w[st])==-1) st++;
            while(st<ed && v.indexOf(w[ed])==-1) ed--;
            char t = w[st];
            w[st] = w[ed];
            w[ed] = t;
            st++;
            ed--;
        }
        String ans = new String(w);
        return ans;
    }
}