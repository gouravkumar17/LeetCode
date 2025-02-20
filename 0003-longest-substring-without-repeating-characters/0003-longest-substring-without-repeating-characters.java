class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int longest = 0;
        int arr[] = new int[128];
        int l = 0;
        for(int i=0;i<n;i++){
            char c = s.charAt(i);
            l = Math.max(arr[c],l);
            longest = Math.max(longest,i-l+1);
            arr[c] = i+1;
        }
        return longest;
    }
}