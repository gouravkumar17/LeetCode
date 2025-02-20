class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int longest = 0;
        int arr[] = new int[128];
        int l = 0;
        for(int i=0;i<n;i++){
            char c1 = s.charAt(i);
            l = Math.max(arr[c1],l);
            longest = Math.max(longest,i-l+1);
            arr[c1] = i+1;
        }
        return longest;
    }
}