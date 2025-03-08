class Solution {
    public int minimumRecolors(String blocks, int k) {
        int n = blocks.length();
        int cnt = 0;
        for(int l=0;l<k;l++){
            if(blocks.charAt(l)=='W') cnt++;
        }
        int i=1;
        int j=k;
        int count=cnt;
        while(i<n && j<n){
            if(blocks.charAt(i-1)=='W') cnt -= 1;
            if(blocks.charAt(j)=='W') cnt += 1;
            count = cnt<count?cnt:count;
            i++;
            j++;
        }
        return count;
    }
}