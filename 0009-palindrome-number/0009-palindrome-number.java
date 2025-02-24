class Solution {
    public boolean isPalindrome(int x) {
        int ans = x;
        int r = 0;
        while(x>0){
            int d = x%10;
            r = r*10+d;
            x = x/10;
        }
        if(r==ans) return true;
        else return false;
    }
}