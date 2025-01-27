class Solution {
    public List<Boolean> checkIfPrerequisite(int numCourses, int[][] prerequisites, int[][] queries) {
        int n = prerequisites.length;
        boolean mat[][] = new boolean[numCourses][numCourses];
        for(int i=0;i<n;i++){
            int s = prerequisites[i][0];
            int d = prerequisites[i][1];
            mat[s][d] = true;
        }
        for(int k=0;k<numCourses;k++){
            for(int s=0;s<numCourses;s++){
                for(int d=0;d<numCourses;d++){
                    mat[s][d] = mat[s][d] || (mat[s][k] && mat[k][d]);
                }
            }
        }
        List<Boolean> ans = new ArrayList<>();
        int l = queries.length;
        for(int i=0;i<l;i++){
            int s = queries[i][0];
            int d = queries[i][1];
            ans.add(mat[s][d]);
        }
        return ans;
    }
}