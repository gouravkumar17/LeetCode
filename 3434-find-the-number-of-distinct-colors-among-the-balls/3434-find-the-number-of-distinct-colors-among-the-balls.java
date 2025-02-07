class Solution {
    public int[] queryResults(int limit, int[][] queries) {
        int n = queries.length;
        HashMap<Integer,Integer> m1 = new HashMap<>();
        HashMap<Integer,Integer> m2 = new HashMap<>();
        int arr[] = new int[n];
        int i = 0;
        for(int x[]:queries){
            if(m1.containsKey(x[0])){
                int p = m1.get(x[0]);
                m2.put(p,m2.get(p)-1);
                if(m2.get(p)==0) m2.remove(p);
            }
            m2.put(x[1],m2.getOrDefault(x[1],0)+1);
            m1.put(x[0],x[1]);
            arr[i] = m2.size();
            i++;
        }
        return arr;
    }
}