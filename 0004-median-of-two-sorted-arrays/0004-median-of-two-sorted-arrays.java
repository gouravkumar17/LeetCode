class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int arr[] = new int[n+m];
        int c = 0;
        for(int i=0;i<n;i++){
            arr[c] = nums1[i];
            c++;
        }
        for(int i=0;i<m;i++){
            arr[c] = nums2[i];
            c++;
        }
        Arrays.sort(arr);
        double num = 0.0;
        for(int i=0;i<n+m;i++){
            if((n+m)%2==0){
                int a = arr[(n+m)/2];
                int b = arr[((n+m)/2)-1];
                num = (a+b)/2.0;
            }
            else num = arr[(n+m)/2];
        }
        return num;
    }
}