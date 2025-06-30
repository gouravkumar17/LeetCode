class Solution {
    public boolean isPerfectSquare(int num) {
        double n = Math.sqrt(num);
        for(int i=1;i<=n;i++){
            if(i*i==num) return true;
        }
        return false;
    }
}