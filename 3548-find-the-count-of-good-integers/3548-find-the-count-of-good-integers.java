class Solution {
    public long countGoodIntegers(int n, int k) {
        Set<String> dist = new HashSet<>();
        int base = (int)Math.pow(10,(n-1)/2);
        int skip = n&1;
        for(int i=base;i<base*10;i++){
            String s = Integer.toString(i);
            s += new StringBuilder(s).reverse().substring(skip);
            long pal = Long.parseLong(s);
            if(pal%k==0){
                char ch[] = s.toCharArray();
                Arrays.sort(ch);
                dist.add(new String(ch));
            }
        }
        long fact[] = new long[n+1];
        fact[0] = 1;
        for(int i=1;i<=n;i++) fact[i] = fact[i-1]*i;
        long ans = 0;
        for(String s:dist){
            int cnt[] = new int[10];
            for(char c:s.toCharArray()) cnt[c-'0']++;
            long t = (n-cnt[0])*fact[n-1];
            for(int x:cnt) t /= fact[x];
            ans += t;
        }
        return ans;
    }
}