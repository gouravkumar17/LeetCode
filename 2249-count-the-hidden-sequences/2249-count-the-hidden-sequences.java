class Solution {
    public int naive(int differences[],int lower,int upper){
        int n=differences.length;
        List<Integer> list=new ArrayList<>();
        for(int i=lower;i<=upper;i++){
            list.add(i);
        }
        //list--> first row
        for(int i=0;i<n;i++){
            List<Integer> temp=new ArrayList<>();
            for(int k:list){
                int ele=k+differences[i];
                if(ele<=upper && ele>=lower){
                    temp.add(ele);
                }
            }
            list=temp;
        }
        return list.size();
    }
    public int numberOfArrays(int[] differences, int lower, int upper) {
        int n=differences.length;
        int currUpper=upper;
        int currLower=lower;
        for(int i=0;i<n;i++){
            int newUpper=currUpper+differences[i];
            int newLower=currLower+differences[i];
            if(newUpper>upper)  newUpper=upper;
            if(newLower<lower)  newLower=lower;

            currUpper=newUpper;
            currLower=newLower;
        }
        int ans=currUpper-currLower+1;
        return ans>=0?ans:0;
    }
}