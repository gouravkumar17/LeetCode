class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> out = new ArrayList<>();
        out.add(new ArrayList<>());
        for(int num:nums){
            int n = out.size();
            for(int i=0;i<n;i++){
                List<Integer> in = new ArrayList<>(out.get(i));
                in.add(num);
                out.add(in);
            }
        }
        return out;
    }
}