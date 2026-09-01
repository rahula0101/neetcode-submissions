class Solution {
    public int[] productExceptSelf(int[] nums) {

        int[] lArr = new int[nums.length];
        int[] rArr = new int[nums.length];

        lArr[0] = 1;
        rArr[nums.length-1] = 1;

        for(int i=1; i<nums.length ; i++){
            lArr[i] = nums[i-1] * lArr[i-1];
        }

        for(int i=nums.length-2; i>=0 ; i--){
            rArr[i] = nums[i+1] * rArr[i+1];
        }

        int sol[] = new int[nums.length];

        for(int i=0; i<nums.length; i++){
            sol[i] = lArr[i] * rArr[i];
        }

        return sol;
        
    }
}  
