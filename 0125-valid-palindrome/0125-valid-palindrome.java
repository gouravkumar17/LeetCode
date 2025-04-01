class Solution {
    public boolean isPalindrome(String s) {
        int n = s.length();
        String a = s.toLowerCase();
        int st = 0;
        int l = n-1;
        while(st<=l){
            char cf = a.charAt(st);
            char cl = a.charAt(l);
            if(!Character.isLetterOrDigit(cf)) st++;
            else if(!Character.isLetterOrDigit(cl)) l--;
            else{
                if(cf!=cl) return false;
                st++;
                l--;
            }
        }
        return true;
    }
}