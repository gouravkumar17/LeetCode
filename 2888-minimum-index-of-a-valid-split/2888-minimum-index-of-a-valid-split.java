class Solution {
    public int minimumIndex(List<Integer> nums) {
        int count = 0;
        int c = nums.get(0);
        for(int n:nums){
            if(n==c) count++;
            else count--;
            if(count==0){
                c = n;
                count = 1;
            }
        }
        int d = c;
        int temp = 0;
        for(int i=0;i<nums.size();i++){
            if(nums.get(i)==d) temp++;
        }
        int p = 0;
        for(int i=0;i<nums.size();i++){
            if(nums.get(i)==d) p++;
            if(p*2>(i+1) && (temp-p)*2>(nums.size()-i-1)) return i;
        }
        return -1;
    }
}