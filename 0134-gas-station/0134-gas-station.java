class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n = gas.length;
        int t = 0;
        int a = 0;
        int id = 0;
        for(int i=0;i<n;i++){
            int c = gas[i]-cost[i];
            t += c;
            a += c;
            if(a<0){
                a = 0;
                id = i+1;
            }
        }
        if(t<0) return -1;
        else return id;
    }
}