class Solution {
    private int p[];
    public int[] findRedundantConnection(int[][] edges) {
        int n = edges.length;
        p = new int[n+1];
        for(int i=0;i<n;i++) p[i] = i;
        for(int e[]:edges){
            if(!un(e[0],e[1])) return e;
        }
        return new int[0];
    }
    private int find(int node){
        if(p[node]!=node) p[node] = find(p[node]);
        return p[node];
    }
    private boolean un(int u,int v){
        int pu = find(u);
        int pv = find(v);
        if(pu==pv) return false;
        p[pu] = pv;
        return true;
    }
}