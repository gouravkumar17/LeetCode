class Solution {
    public String convertToTitle(int columnNumber) {
        int n = columnNumber;
        StringBuilder res = new StringBuilder();
        while(n>0){
            n--;
            char ch = (char)('A'+(n%26));
            res.insert(0,ch);
            n = n/26;
        }
        return res.toString();
    }
}