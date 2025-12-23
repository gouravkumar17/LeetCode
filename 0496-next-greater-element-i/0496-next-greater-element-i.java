class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int res[] = new int[n];
        for(int i=0;i<n;i++){
            int idx = -1;
            int j = nums2.length-1;
            while(j>=0 && nums2[j]!=nums1[i]){
                if(nums2[j]>nums1[i]) idx = nums2[j];
                j--;
            }
            res[i] = idx;
        }
        return res;
    }
}