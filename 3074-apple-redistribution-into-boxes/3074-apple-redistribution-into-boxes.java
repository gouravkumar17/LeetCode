class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        int n = apple.length;
        int m = capacity.length;
        int arr[] = new int[51];
        int ans = 0;
        int sum = 0;
        for(int i=0;i<n;i++){
            sum = sum+apple[i];
        }
        for(int i=0;i<m;i++){
            arr[capacity[i]]++;
        }
        for(int i=50;i>0;i--){
            while(arr[i]>0){
                sum = sum-i;
                arr[i]--;
                ans++;
                if(sum<=0) return ans;
            }
        }
        return ans;
    }
}