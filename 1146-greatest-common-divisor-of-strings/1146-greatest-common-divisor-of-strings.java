class Solution {
    public String gcdOfStrings(String str1, String str2) {
        int n1 = str1.length();
        int n2 = str2.length();
        String a = str1+str2;
        String b = str2+str1;
        if(!a.equals(b)) return "";
        int gcd = gcd(n1,n2);
        return str1.substring(0,gcd);
    }
    private int gcd(int a,int b){
        if(b==0) return a;
        else return gcd(b,a%b);
    }
}