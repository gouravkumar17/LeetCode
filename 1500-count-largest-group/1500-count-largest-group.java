class Solution {
    public int find(int num) {
        int sum = 0;
        while(num>0){
            sum += num%10;
            num = num/10;
        }
        return sum;
    }
    public int countLargestGroup(int n) {
        Map<Integer,Integer> m = new HashMap<>();
        int mS = 0;
        int cnt = 0;
        for(int num=1;num<=n;num++){
            int d = find(num);
            m.put(d,m.getOrDefault(d,0)+1);
            if(m.get(d)==mS) cnt++;
            else if(m.get(d)>mS){
                mS = m.get(d);
                cnt = 1;
            }
        }
        return cnt;
    }
}