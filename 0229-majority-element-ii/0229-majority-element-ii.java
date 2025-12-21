class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        List<Integer> l = new ArrayList<>();
        Map<Integer,Integer> map = new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int s = n/3;
        for(var e:map.entrySet()){
            if(e.getValue()>s) l.add(e.getKey());
        }
        return l;
    }
}