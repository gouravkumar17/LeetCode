class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            int value = nums[i];
            if(map.containsKey(target-value)) return new int[]{i,map.get(target-value)};
            map.put(value,i);
        }
        return new int[]{};
    }
}