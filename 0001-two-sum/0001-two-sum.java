class Solution {
    public int[] twoSum(int[] nums, int target) {
        // int n = nums.length;
        // Map<Integer,Integer> map = new HashMap<>();
        // for(int i=0;i<n;i++){
        //     int value = nums[i];
        //     if(map.containsKey(target-value)) return new int[]{i,map.get(target-value)};
        //     map.put(value,i);
        // }
        // return new int[]{};


        int n = nums.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(nums[i]+nums[j]==target) return new int[]{i,j};
            }
        }
        return new int[]{};
    }
}