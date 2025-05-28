class Solution {
    public int lengthOfLastWord(String s) {
        String res[] = s.split(" ");
        int n = res.length-1;
        return res[n].length();
    }
}