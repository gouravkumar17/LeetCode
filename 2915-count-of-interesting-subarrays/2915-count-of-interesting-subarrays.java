class Solution {
    public long countInterestingSubarrays(List<Integer> nums, int modulo, int k) {
        Map<Integer,Long> map = new HashMap<>();
        map.put(0,1L);
        long c = 0;
        int p = 0;
        for(int num:nums){
            if(num%modulo==k) p++;
            int a = p%modulo;
            int t = (a-k+modulo)%modulo;
            c += map.getOrDefault(t,0L);
            map.put(a,map.getOrDefault(a,0L)+1);
        }
        return c;
    }
}