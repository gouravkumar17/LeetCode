class Solution {
    public boolean detectCapitalUse(String word) {
        int n = word.length();
        int capC = 0;
        for(int i=0;i<n;i++){
            if(Character.isUpperCase(word.charAt(i))) capC++;
        }
        if(capC==0) return true;
        else if(capC==n) return true;
        else if(capC==1 && Character.isUpperCase(word.charAt(0))) return true;
        else return false;
    }
}