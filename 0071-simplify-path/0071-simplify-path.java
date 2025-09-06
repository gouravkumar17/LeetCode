class Solution {
    public String simplifyPath(String path) {
        Stack<String> st = new Stack<>();
        for(String s:path.split("/")){
            if(s.equals("") || s.equals(".")) continue;
            else if(s.equals("..")){
                if(!st.isEmpty()) st.pop();
            }
            else st.push(s);
        }
        StringBuilder sb = new StringBuilder();
        for(String s:st) sb.append("/").append(s);
        int n = sb.length();
        if(n==0) return "/";
        else return sb.toString();
    }
}