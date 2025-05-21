class Solution {
    public String mergeAlternately(String word1, String word2) {
        int p1 = 0;
        int p2 = 0;
        int x = word1.length();
        int y = word2.length();
        StringBuilder s = new StringBuilder();
        while(p1<x || p2<y){
            if(p1<x) s.append(word1.charAt(p1++));
            if(p2<y) s.append(word2.charAt(p2++));
        }
        return s.toString();
    }
}