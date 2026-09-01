class Solution {
    public int[] twoSum(int[] nums, int target) {

        int[] sol = new int[2];

        Map<Integer,Integer> diffLocation = new HashMap<>();
        
        for(int i=0; i< nums.length ; i++ ){

            int diff = target - nums[i];

            if(diffLocation.get(diff) != null){
                sol[0] = diffLocation.get(diff);
                sol[1] = i;

                return sol;
            }else{
                diffLocation.put(nums[i], i);
            }
        }

        return sol;

    }
}
