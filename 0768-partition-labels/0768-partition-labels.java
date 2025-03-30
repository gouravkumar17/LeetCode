class Solution {
    public List<Integer> partitionLabels(String s) {
        int n = s.length();
        List<Integer> res = new ArrayList<>();
        int l[] = new int[26];
        for(int i=0;i<n;i++){
            l[s.charAt(i)-'a'] = i;
        }
        int i = 0;
        int st = 0;
        int e = 0;
        while(i<n){
            e = Math.max(e,l[s.charAt(i)-'a']);
            if(i==e){
                res.add(e-st+1);
                st = e+1;
            }
            i++;
        }
        return res;
    }
}