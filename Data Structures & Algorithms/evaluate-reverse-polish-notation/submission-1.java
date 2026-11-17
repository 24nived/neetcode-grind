class Solution {
    public int evalRPN(String[] tokens) {

        Stack <Integer> s = new Stack<>();

        for(String a : tokens){
          //  char a = tokens.charAt(c);

            if(a.equals("+") || a.equals("-") || a.equals("/") || a.equals("*")){
                int i = s.pop();
                int j = s.pop();
                int sum;
                if(a.equals("+")){
                    sum = j+i;
                }else if(a.equals("-")){
                    sum = j-i;
                }else if(a.equals("/")){
                    sum = j/i;
                }else{
                    sum = j*i;
                }
                s.push(sum);
                continue;
            }else{
            int num = Integer.parseInt(a);
            s.push(num);
            }
        }
        return s.peek();
    }
}
