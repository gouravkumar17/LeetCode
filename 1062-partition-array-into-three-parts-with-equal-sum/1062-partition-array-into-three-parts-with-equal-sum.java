class Solution {
    public boolean canThreePartsEqualSum(int[] arr) {
        int n = arr.length;
        int sum = 0;
        for(int i=0;i<n;i++){
            sum = sum+arr[i];
        }
        if(sum%3!=0) return false;
        int st = 0;
        int t = sum/3;
        int cnt = 0;
        for(int i=0;i<n;i++){
            st = st+arr[i];
            if(st == t){
                cnt++;
                st = 0;
            }
            if(cnt == 3) return true;
        }
        return false;
    }
}