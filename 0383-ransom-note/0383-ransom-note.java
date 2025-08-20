class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int n1 = ransomNote.length();
        int n2 = magazine.length();
        HashMap<Character,Integer> m = new HashMap<>();
        for(int i=0;i<n2;i++){
            char ch = magazine.charAt(i);
            m.put(ch,m.getOrDefault(ch,0)+1);
        }
        for(int i=0;i<n1;i++){
            char ch = ransomNote.charAt(i);
            if(m.containsKey(ch) && m.get(ch) > 0) m.put(ch,m.get(ch)-1);
            else return false;
        }
        return true;
    }
}