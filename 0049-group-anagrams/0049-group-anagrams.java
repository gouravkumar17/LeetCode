class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> m = new HashMap<>();
        for(String w:strs){
            char c[] = w.toCharArray();
            Arrays.sort(c);
            String k = new String(c);
            List<String> g = m.getOrDefault(k,new ArrayList<>());
            g.add(w);
            m.put(k,g);
        }
        return new ArrayList<>(m.values());
    }
}