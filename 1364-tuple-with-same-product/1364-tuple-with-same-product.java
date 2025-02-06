class Solution {
    public int tupleSameProduct(int[] nums) {
        int n = nums.length;
        Map<Integer,Integer> m = new HashMap<>();
        int cnt = 0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int p = nums[i]*nums[j];
                if(m.containsKey(p)) cnt = cnt+m.get(p);
                m.put(p,m.getOrDefault(p,0)+1);
            }
        } 
        return cnt*8;
    }
}