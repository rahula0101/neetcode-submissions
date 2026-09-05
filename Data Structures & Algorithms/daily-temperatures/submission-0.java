class Solution {
    public int[] dailyTemperatures(int[] temperatures) {

        Stack<Integer> st = new Stack<>();

        int[] res = new int[temperatures.length];

        for(int i=0; i<temperatures.length; i++){

            int curr = temperatures[i];

            while(!st.isEmpty() && curr > temperatures[st.peek()]){
                int top = st.pop();
                res[top] = i-top; 
            }

            st.push(i);
        }


        return res;
        
    }
}
