class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;

        Set<Integer> hSet = new HashSet<>();

        for (int n : nums) {
            hSet.add(n);
        }

        int sol = 0;

        for (int n : hSet) {
            if (!hSet.contains(n - 1)) {
                int currNum = n;
                int currStream = 1;

                while (hSet.contains(currNum + 1)) {
                    currNum += 1;
                    currStream += 1;
                }

                sol = Math.max(sol, currStream);
            }
        }

        return sol;
    }
}