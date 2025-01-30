class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        for(int i=n-1;i>=0;i--){
            int d = digits[i];
            if(d+1!=10){
                d = d+1;
                return d;
            }
            
        }
    }
}