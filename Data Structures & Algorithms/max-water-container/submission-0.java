class Solution {
    public int maxArea(int[] heights) {
        int i = 0;
        int r = heights.length - 1;

        int maxWater = 0;

        while (i < r) {
            int curr = Math.min(heights[i], heights[r]) * (r - i);

            maxWater = Math.max(curr, maxWater);

            if (heights[i] <= heights[r]) {
                i++;
            } else {
                r--;
            }
        }

        return maxWater;
    }
}
