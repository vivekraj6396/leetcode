class Solution {
    public String reverseParentheses(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<s.length();i++) {
            char c=s.charAt(i);
            if(c!=')') {
                stack.push(c);
            } else {
                String temp="";
                while(!stack.isEmpty() && stack.peek()!='(') {
                    temp=temp+stack.pop();
                }
                stack.pop(); 
                for(int j=0;j<temp.length();j++) {
                    stack.push(temp.charAt(j));
                }
            }
        }
        String ans="";
        while(!stack.isEmpty()) {
            ans=stack.pop()+ans;
        }
        return ans;
    }
}