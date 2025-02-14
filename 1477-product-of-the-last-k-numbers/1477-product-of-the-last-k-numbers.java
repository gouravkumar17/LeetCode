class ProductOfNumbers {
    private List<Integer> p;
    public ProductOfNumbers() {
        p = new ArrayList<>();
        p.add(1);
    }
    public void add(int num) {
        if(num == 0){
            p.clear();
            p.add(1);
        }
        else{
            p.add(p.get(p.size()-1)*num);
        }
    }
    public int getProduct(int k) {
        if(p.size()<=k) return 0;
        int l = p.size();
        return p.get(l-1)/p.get(l-k-1);
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */