class Solution {
    public boolean isPalindrome(String s) {
        int n = s.length();
        s = s.toLowerCase();
        String o = "";
        String r = "";
        for(int i=0;i<n;i++){
            if(Character.isLetterOrDigit(s.charAt(i))==true){
                o += s.charAt(i);
                r = s.charAt(i)+r;
            }
        }
        return o.equals(r);
    }
}