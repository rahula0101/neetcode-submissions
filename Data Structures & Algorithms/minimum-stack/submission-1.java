class MinStack {

    Stack<Integer> st = null;
    Stack<Integer> minSt = null;

    public MinStack() {
        st = new Stack<>();
        minSt = new Stack<>();
    }
    
    public void push(int val) {
        st.push(val);

        if(minSt.isEmpty() || val <= minSt.peek()){
            minSt.push(val);
        }
    }
    
    public void pop() {

        if(st.isEmpty()){
            return;
        }

       int val =  st.pop();

       if(val == minSt.peek()){
        minSt.pop();
       }


    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
        return minSt.peek();
    }
}
