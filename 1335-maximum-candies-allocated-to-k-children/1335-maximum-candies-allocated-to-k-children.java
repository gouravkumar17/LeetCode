class Solution {
    public int maximumCandies(int[] candies, long k){
        long sum = getTotalCandies(candies);
        if(sum<k) return 0;
        return binarySearch(candies,k);
    }
    private int binarySearch(int[] candies,long k){
        long right = getMaxPile(candies);
        long left = 1;
        while(left<=right){
            long mid = (left+right)/2;
            if(canAllocate(candies,k,mid)) left = mid+1;
            else right = mid-1;
        }
        return (int) right;
    }
    private long bruteForce(int[] candies,long k){
        long maxPile = getMaxPile(candies);
        while(maxPile>0) {
            if(canAllocate(candies,k,maxPile))return maxPile;
            maxPile--;
        }
        return 0;
    }
    private boolean canAllocate(int[] candies, long k, long maxCandies) {
        int i = 0;
        while (i < candies.length) {
            k -= candies[i] / maxCandies;
            i++;
            if (k <= 0) {
                return true;
            }
        }
        return false;
    }

    private long getTotalCandies(int[] candies) {
        long sum = 0;
        for (int candy : candies) {
            sum += candy;
        }
        return sum;
    }

    private long getMaxPile(int[] candies) {
        long max = Integer.MIN_VALUE;
        for (int candy : candies) {
            max = Math.max(candy, max);
        }
        return max;
    }
}