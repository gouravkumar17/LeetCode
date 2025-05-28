class Solution {
    public int candy(int[] ratings) {
        int n = ratings.length;
        int can = n;
        int i = 1;
        while(i<n){
            if(ratings[i]==ratings[i-1]){
                i++;
                continue;
            }
            int p = 0;
            while(ratings[i]>ratings[i-1]){
                p++;
                can = can+p;
                i++;
                if(i==n) return can;
            }
            int d = 0;
            while(i<n && ratings[i]<ratings[i-1]){
                d++;
                can = can+d;
                i++;
            }
            int c = Math.min(p,d);
            can = can-c;
        }
        return can;
    }
}