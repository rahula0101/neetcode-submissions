class Solution {
    public boolean hasDuplicate(int[] nums) {

        Arrays.sort(nums);

        int v = -1;

        for(int n : nums){
            if(n == v){
                return true;
            }else{
                v = n;
            }
        }

        return false;
 
    }
}
