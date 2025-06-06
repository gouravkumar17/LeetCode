class Solution {
    public int minimumOperations(int[] nums) {
        int n = nums.length;
        HashSet<Integer> st = new HashSet<>();
        int ans = 0;
        for(int i=n-1;i>=0;i--){
            if(!st.isEmpty() && st.contains(nums[i])){
                ans = (i+1)/3;
                if((i+1)%3!=0) ans = ans+1;
                break;
            }
            st.add(nums[i]);
        }
        return ans;
    }
}