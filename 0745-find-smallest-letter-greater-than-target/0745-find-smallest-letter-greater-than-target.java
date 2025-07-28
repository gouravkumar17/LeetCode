class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int l = 0;
        int h = letters.length-1;
        int m = 0;
        int p = -1;
        while(l<=h){
            m = l+(h-l)/2;
            if(letters[m]>target){
                p = m;
                h = m-1;
            }
            else l = m+1;
        }
        if(p==-1) return letters[0];
        else return letters[p];
    }
}