class Solution {
    public boolean isValid(String s) {
        int n=s.length();
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<n;i++){
            char current=s.charAt(i);
            if(current == '(' || current == '[' || current == '{'){
                stack.push(current);
            }
            else{   
                if(stack.isEmpty())     return false;
                char top=stack.pop();
                if( ( current == ')' && top != '(' ) ||
                    ( current == ']' && top != '[' ) ||
                    ( current == '}' && top != '{' ) ){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}