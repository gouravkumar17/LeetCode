class Solution {
    public List<String> summaryRanges(int[] nums) {
        int n = nums.length;
        ArrayList<String> l = new ArrayList<>();
        for(int i=0;i<n;i++){
            int s = nums[i];
            while(i+1<n && nums[i]+1==nums[i+1]) i++;
            if(s!=nums[i]) l.add(""+s+"->"+nums[i]);
            else l.add(""+s);
        }
        return l;
    }
}