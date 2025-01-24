class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        int n = graph.length;
        boolean vis[] = new boolean[n];
        boolean rec[] = new boolean[n];
        for(int i=0;i<n;i++){
            if(!vis[i]){
                boolean flag = task(graph,i,vis,rec);
            }
        }
        List<Integer> ans = new ArrayList<>();
        for(int i=0;i<n;i++){
            if(!rec[i]) ans.add(i);
        }
        return ans;
    }
    private boolean task(int[][] adj,int i,boolean vis[],boolean rec[]){
        vis[i] = rec[i] = true;
        for(int p: adj[i]){
            if(!vis[p] && task(adj,p,vis,rec)) return true;
            if(rec[p]) return true;
        }
        rec[i] = false;
        return false;
    }
}