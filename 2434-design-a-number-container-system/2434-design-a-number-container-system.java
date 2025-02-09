class NumberContainers {
    HashMap<Integer,PriorityQueue<Integer>> num;
    HashMap<Integer,Integer> idx;
    public NumberContainers() {
        num = new HashMap<>();
        idx = new HashMap<>();
    }
    public void change(int index, int number) {
        idx.put(index,number);
        if(!num.containsKey(number)) num.put(number,new PriorityQueue<>());
        num.get(number).offer(index);
    }
    public int find(int number) {
        if(!num.containsKey(number)) return -1;
        PriorityQueue<Integer> pq = num.get(number);
        while(!pq.isEmpty()){
            int id = pq.peek();
            if(idx.get(id)==number) break;
            else pq.poll();
        }
        if(pq.isEmpty()){
            num.remove(number);
            return -1;
        }
        return num.get(number).peek();
    }
}

/**
 * Your NumberContainers object will be instantiated and called as such:
 * NumberContainers obj = new NumberContainers();
 * obj.change(index,number);
 * int param_2 = obj.find(number);
 */