class Solution {
    public boolean rotateString(String s, String goal) {
        int n = s.length();
        int m = goal.length();
        String ans = s+s;
        if(n!=m) return false;
        return ans.contains(goal);
    }
}