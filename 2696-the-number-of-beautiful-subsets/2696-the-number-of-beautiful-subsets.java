class Solution {
    int ans;
    public void function(int idx, int k, int nums[], HashMap<Integer,Integer> map){
        if(idx==nums.length){
            if(!map.isEmpty()) ans++;
            return;
        }
        int x = nums[idx];
        if(!map.containsKey(x-k) && !map.containsKey(x+k)){
            map.put(x,map.getOrDefault(x,0)+1);
            function(idx+1, k, nums, map);
            map.put(x,map.get(x)-1);
            if(map.get(x)==0) map.remove(x);
        }
        function(idx+1,k,nums,map);
    }
    public int beautifulSubsets(int[] nums, int k) {
        ans = 0;
        function(0, k, nums, new HashMap<>());
        return ans;
    }
}