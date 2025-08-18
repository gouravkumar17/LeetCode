class Solution {
    public boolean isLongPressedName(String name, String typed) {
        if(typed.charAt(0)!=name.charAt(0)) return false;
        int n1 = name.length();
        int n2 = typed.length();
        int i = 1;
        int j = 1;
        while(j<n2){
            if(i<n1 && name.charAt(i) == typed.charAt(j)) i++;
            else if(typed.charAt(j) != typed.charAt(j-1)) return false;
            j++;
        }
        return i==n1;
    }
}