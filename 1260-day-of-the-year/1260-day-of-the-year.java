class Solution {
    public int dayOfYear(String date) {
        String n[] = date.split("-");
        int arr[] = {31,28,31,30,31,30,31,31,30,31,30,31};
        int y = Integer.parseInt(n[0]);
        int m = Integer.parseInt(n[1]);
        int d = Integer.parseInt(n[2]);
        if(isL(y)) arr[1] = 29;
        int res = 0;
        for(int i=0;i<m-1;i++) res += arr[i];
        res += d;
        return res;
    }
    boolean isL(int n){
        return (n%4==0 && n%100!=0) || (n%400==0);
    }
}