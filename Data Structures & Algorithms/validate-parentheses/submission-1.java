class Solution {
    public boolean isValid(String s) {
        
        Deque<Character> st = new ArrayDeque<>();

        for(int i=0 ; i<s.length(); i++){

            Character c = s.charAt(i);

            if(c == '(' || c == '[' || c == '{'){
                st.push(c);
            }

            if(c == ')'){
                
                if(st.isEmpty() || st.peek() != '('){
                    return false;
                }else{
                    st.pop();
                }
            }

             if(c == '}'){
                
                if(st.isEmpty() || st.peek() != '{'){
                    return false;
                }else{
                    st.pop();
                }
            }

             if(c == ']'){
                
                if(st.isEmpty() || st.peek() != '['){
                    return false;
                }else{
                    st.pop();
                }
            }
        }


        return st.isEmpty() ? true : false;

    }
}
