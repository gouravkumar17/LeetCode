class Solution {
    public boolean isAnagram(String s, String t) {
        int n1 = s.length();
        int n2 = t.length();
        if(n1!=n2) return false;
        int f[] = new int[26];
        for(char c:s.toCharArray()){
            f[c-'a']++;
        }
        for(char c:t.toCharArray()){
            if(f[c-'a']<=0) return false;
            f[c-'a']--;
        }
        return true;
    }
}