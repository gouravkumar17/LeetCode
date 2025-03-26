class Solution {
    public boolean checkValidCuts(int n, int[][] rectangles) {
        return calculate(rectangles, 0) || calculate(rectangles, 1);
    }

    private boolean calculate(int[][] rectangles, int startIndex){
        Arrays.sort(rectangles, (a,b)-> a[startIndex] - b[startIndex]);
        int count = 0;

        for(int i = 1, lastEnd = rectangles[0][startIndex + 2]; i < rectangles.length; i++){
            int currStart = rectangles[i][startIndex], currEnd = rectangles[i][startIndex + 2];

            if(currStart >= lastEnd)
                count++;
            lastEnd = Math.max(lastEnd, currEnd);
        }

        return count >= 2;
    }
}