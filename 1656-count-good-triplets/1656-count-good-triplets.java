class Solution {
    public int countGoodTriplets(int[] arr, int a, int b, int c) {
        int n = arr.length;
        int cnt = 0;
        for(int i=0;i<=n-3;i++){
            for(int j=i+1;j<=n-2;j++){
                if(Math.abs(arr[i]-arr[j])<=a){
                    for(int k=j+1;k<=n-1;k++){
                        if(Math.abs(arr[j]-arr[k])<=b && Math.abs(arr[i]-arr[k])<=c) cnt++;
                    }
                }
            }
        }
        return cnt;
    }
}