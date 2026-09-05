class Solution {
    public int evalRPN(String[] tokens) {

        Stack<Integer> st = new Stack<>();

        for(int i=0; i<tokens.length; i++){

            //System.out.println(tokens[i]);

            if(tokens[i].equals( "*") || tokens[i].equals( "+") || tokens[i].equals( "/") || tokens[i].equals("-")){

               // System.out.println("Inside operatpor");

                int a = st.pop();
                int b = st.pop();

                if(tokens[i].equals("*")){
                    st.push(a * b);
                }else if (tokens[i].equals("/")){
                    st.push(b/a);
                }else if(tokens[i].equals("+")){
                    st.push(a+b);
                }else if(tokens[i].equals( "-")){
                    st.push(b-a);
                }

            }else{
                st.push(Integer.valueOf(tokens[i]));
            }
        }


        return st.pop();
        
    }
}
