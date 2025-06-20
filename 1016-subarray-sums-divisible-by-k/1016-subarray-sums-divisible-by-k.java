class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int arr[] = new int[k];
        arr[0] = 1;
        int sum = 0;
        int count = 0;
        for(int n:nums){
            sum = sum+n;
            int rem = sum%k;
            if(rem<0) rem = rem+k;
            count = count+arr[rem];
            arr[rem]++;
        }
        return count;
    }
}