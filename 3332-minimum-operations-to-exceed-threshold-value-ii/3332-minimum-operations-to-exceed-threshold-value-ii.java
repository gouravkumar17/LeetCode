class Solution {
    public int minOperations(int[] nums, int k) {
        PriorityQueue<Long> p = new PriorityQueue<>();
        for(int i:nums) p.add((long)i);
        int cnt = 0;
        while(p.peek()<k){
            long x = p.poll();
            long y = p.poll();
            long val = Math.min(x,y)*2+Math.max(x,y);
            p.add(val);
            cnt++;
        }
        return cnt;
    }
}