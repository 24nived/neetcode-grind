class Solution {
    public boolean isValid(String s) {
        Stack <Character> str = new Stack<>();

        for(char c:s.toCharArray()){
            if(c=='('){
                str.push(')');
            }else if(c=='{'){
                str.push('}');
            }else if(c=='['){
                str.push(']');
            }else if (str.isEmpty() || str.pop() != c){
                return false;
            }
        }
        return str.isEmpty();
    }
}
