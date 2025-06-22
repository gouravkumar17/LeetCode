class Solution {
    public int characterReplacement(String s, int k) {
        int n = s.length();
        int arr[] = new int[26];
        int res = 0;
        int maxR = 0;
        int l = 0;
        for(int i=0;i<n;i++){
            arr[s.charAt(i)-'A']++;
            maxR = Math.max(maxR,arr[s.charAt(i)-'A']);
            if(i-l+1-maxR > k){
                arr[s.charAt(l)-'A']--;
                l++;
            }
            res = Math.max(res,i-l+1);
        }
        return res;
    }
}