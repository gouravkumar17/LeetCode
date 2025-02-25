class Solution {
    public int numOfSubarrays(int[] arr) {
        int n = arr.length;
        long cnt = 0;
        long sum = 0;
        long even = 1;
        long odd = 0;
        final long m = 1000000007;
        for(int i=0;i<n;i++){
            sum = sum+arr[i];
            if(sum%2==1){
                cnt = cnt+even;
                odd++;
            }
            else{
                cnt = cnt+odd;
                even++;
            }
            cnt = cnt%m;
        }
        return (int)cnt;
    }
}