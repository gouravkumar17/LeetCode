/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int l = 1;
        int r = n;
        while(l<r){
            int m = l+(r-l)/2;
            if(isBadVersion(m)) r = m;
            else l = m+1;
        }
        return l;
    }
}