class Solution {
    private static void find(List<List<Integer>> res, int nums[], List<Integer> t, int s){
        int n = nums.length;
        res.add(new ArrayList<>(t));
        for(int i=s;i<n;i++){
            if(i>s && nums[i]==nums[i-1]) continue;
            t.add(nums[i]);
            find(res,nums,t,i+1);
            t.remove(t.size()-1);
        }
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        find(res,nums,new ArrayList<>(), 0);
        return res;
    }
}