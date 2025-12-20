class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int i = 0,j = 0;
        int max = 0;
        Set<Character> set = new HashSet<>();
        while(j<n){
            if(!set.contains(s.charAt(j))){
                set.add(s.charAt(j));
                j++;
                max = Math.max(max,set.size());
            }
            else{
                set.remove(s.charAt(i));
                i++;
            }
        }
        return max;
    }
}