class Solution {
    public boolean wordPattern(String pattern, String s) {
        String arr[] = s.split(" ");
        int l = arr.length;
        int n = pattern.length();
        // int m = s.length();
        if(n!=l) return false;
        HashMap<Character,String> map = new HashMap<>();
        HashSet<String> set = new HashSet<>();
        for(int i=0;i<n;i++){
            char c = pattern.charAt(i);
            String x = arr[i];
            if(map.containsKey(c)){
                if(!map.get(c).equals(x)) return false;
            }
            else{
                if(set.contains(x)) return false;
                map.put(c,x);
                set.add(x);
            }
        }
        return true;
    }
}