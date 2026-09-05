class Solution {
     public int carFleet(int target, int[] position, int[] speed) {
        int n = position.length;
        if (n == 0) return 0;

        // Pair up position and speed
        double[][] pair = new double[n][2];
        for (int i = 0; i < n; i++) {
            pair[i][0] = position[i];
            pair[i][1] = speed[i];
        }
        
        // Sort by position in descending order (closest to target first)
        Arrays.sort(pair, (a, b) -> Double.compare(b[0], a[0]));

        Stack<Double> st = new Stack<>();

        for (int i = 0; i < pair.length; i++) {
            // Calculate time to reach target
            double time = (target - pair[i][0]) / pair[i][1];

            // If stack is empty, or this car takes MORE time than the fleet ahead,
            // it cannot catch up, so it forms a new fleet.
            if (st.isEmpty() || time > st.peek()) {
                st.push(time);
            }
            // If time <= st.peek(), it catches up to the fleet ahead, 
            // so we do nothing (it becomes part of that existing fleet).
        }

        return st.size();
    }
}
