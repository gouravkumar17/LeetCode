class Solution {
    public int maximumSum(int[] nums) {
        int n = nums.length;
        int m = -1;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            int k = 0;
            int num = nums[i];
            while(num!=0){
                k += num%10;
                num = num/10;
            }
            if(!map.containsKey(k)) map.put(k,nums[i]);
            else{
                m = Math.max(m,map.get(k)+nums[i]);
                map.put(k,Math.max(map.get(k),nums[i]));
            }
        }
        return m;
    }
}