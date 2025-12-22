class Solution {
    public List<Integer> majorityElement(int[] nums) {
        // int n = nums.length;
        // List<Integer> l = new ArrayList<>();
        // Map<Integer,Integer> map = new HashMap<>();
        // for(int num:nums){
        //     map.put(num,map.getOrDefault(num,0)+1);
        // }
        // int s = n/3;
        // for(var e:map.entrySet()){
        //     if(e.getValue()>s) l.add(e.getKey());
        // }
        // return l;


        int n = nums.length;
        int c1 = 0;
        int c2 = 0;
        int cnt1 = 0;
        int cnt2 = 0;
        for(int num:nums){
            if(c1==num) cnt1++;
            else if(c2==num) cnt2++;
            else if(cnt1==0){
                c1 = num;
                cnt1 = 1;
            }
            else if(cnt2==0){
                c2 = num;
                cnt2 = 1;
            }
            else{
                cnt1--;
                cnt2--;
            }
        }
        cnt1 = 0;
        cnt2 = 0;
        for(int num:nums){
            if(num==c1) cnt1++;
            else if(num==c2) cnt2++;
        }
        List<Integer> res = new ArrayList<>();
        if(cnt1>n/3) res.add(c1);
        if(cnt2>n/3) res.add(c2);
        return res;
    }
}