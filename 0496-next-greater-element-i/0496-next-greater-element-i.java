class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        // int n = nums1.length;
        // int res[] = new int[n];
        // for(int i=0;i<n;i++){
        //     int idx = -1;
        //     int j = nums2.length-1;
        //     while(j>=0 && nums2[j]!=nums1[i]){
        //         if(nums2[j]>nums1[i]) idx = nums2[j];
        //         j--;
        //     }
        //     res[i] = idx;
        // }
        // return res;

        int n = nums1.length;
        int res[] = new int[n];
        Stack<Integer> st = new Stack<>();
        Map<Integer,Integer> map = new HashMap<>();
        for(int num:nums2){
            while(!st.isEmpty() && num>st.peek()) map.put(st.pop(),num);
            st.add(num);
        }
        int temp = 0;
        for(int num:nums1){
            res[temp] = map.getOrDefault(num,-1);
            temp++;
        }
        return res;
    }
}