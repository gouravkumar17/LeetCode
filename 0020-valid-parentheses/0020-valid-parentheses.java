class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for(char ch:s.toCharArray()){
            if(ch=='(' || ch=='{' || ch=='[') st.push(ch);
            else{
                if(st.isEmpty()) return false;
                else if(ch==')'){
                    if(st.pop()!='(') return false;
                }
                else if(ch=='}'){
                    if(st.pop()!='{') return false;
                }
                else if(ch==']'){
                    if(st.pop()!='[') return false;
                }
            }
        }
        return st.isEmpty();
    }
}