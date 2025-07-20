class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> r = new ArrayList<>();
        r.add(1);
        for(int i=0;i<rowIndex;i++){
            List<Integer> nR = new ArrayList<>();
            nR.add(1);
            for(int j=1;j<r.size();j++){
                nR.add(r.get(j-1)+r.get(j));
            }
            nR.add(1);
            r = nR;
        }
        return r;
    }
}