class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> s = new HashSet<>();
        for(int n:nums) s.add(n);
        int l = 0;
        for(int n:s){
            if(!s.contains(n-1)){
                int len = 1;
                while(s.contains(n+len)) len++;
                l = Math.max(l,len);
            }
        }
        return l;
    }
}