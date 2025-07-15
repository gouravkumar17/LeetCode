class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        ArrayList<Integer> ans = new ArrayList<>();
        int n = num.length-1;
        while(n>=0 || k>0){
            if(n>=0){
                k = k+num[n];
                n--;
            }
            ans.add(k%10);
            k = k/10;
        }
        Collections.reverse(ans);
        return ans;
    }
}