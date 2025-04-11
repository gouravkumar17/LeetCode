class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int cnt = 0;
        for(int i = low;i<=high;i++){
            String str = Integer.toString(i);
            int n = str.length();
            if(n%2!=0) continue;
            int h = n/2;
            int lS = 0;
            int rS = 0;
            for(int j=0;j<h;j++){
                lS += str.charAt(j)-'0';
            }
            for(int j=h;j<n;j++){
                rS += str.charAt(j)-'0';
            }
            if(lS==rS) cnt++;
        }
        return cnt;
    }
}