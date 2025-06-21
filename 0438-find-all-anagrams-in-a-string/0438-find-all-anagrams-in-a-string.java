class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        char sc[] = s.toCharArray();
        char pc[] = p.toCharArray();
        Arrays.sort(pc);
        List<Integer> ans = new ArrayList<>();
        int n = sc.length;
        int k = pc.length;
        for(int i=0;i<=n-k;i++){
            String str = s.substring(i,i+k);
            char sort[] = str.toCharArray();
            Arrays.sort(sort);
            if(Arrays.equals(pc,sort)) ans.add(i);
        }
        return ans;
    }
}