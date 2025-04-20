class Solution {
    public int numRabbits(int[] answers) {
        int l = answers.length;
        int ans = 0;
        HashMap<Integer,Integer> m = new HashMap<>();
        for(int i=0;i<l;i++){
            m.put(answers[i],m.getOrDefault(answers[i],0)+1);
        }
        for(int n:m.keySet()){
            if(m.get(n)%(n+1)==0) ans += m.get(n);
            else ans+= m.get(n)+n+1-m.get(n)%(n+1);
        }
        return ans;
    }
}