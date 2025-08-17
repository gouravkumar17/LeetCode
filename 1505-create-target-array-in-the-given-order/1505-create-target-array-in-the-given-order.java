class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        int n = nums.length;
        ArrayList<Integer> l = new ArrayList<>();
        for(int i=0;i<n;i++){
            l.add(index[i],nums[i]);
        }
        int s = l.size();
        int t[] = new int[s];
        for(int i=0;i<s;i++){
            t[i] = l.get(i);
        }
        return t;
    }
}