class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        Map<Integer,Integer> p = new HashMap<>();
        for(int i=0;i<n;i++){
            int num = nums[i];
            if(p.containsKey(target-num)) return new int[] {i,p.get(target-num)};
            p.put(num,i);
        }
        return new int[] {};
    }
}