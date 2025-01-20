class Solution {
    public int firstCompleteIndex(int[] arr, int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        int rCount[] = new int[n];
        int cCount[] = new int[m];
        HashMap<Integer,int[]> map = new HashMap<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                map.put(mat[i][j],new int[]{i,j});
            }
        }
        int totalC = n*m;
        for(int i=0;i<totalC;i++){
            int cell[] = map.get(arr[i]);
            rCount[cell[0]]++;
            cCount[cell[1]]++;
            if(rCount[cell[0]]==m || cCount[cell[1]]==n) return i;
        }
        return -1;
    }
}