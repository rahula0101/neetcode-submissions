class Solution {
    public int[] twoSum(int[] numbers, int target) {

        int[] sol = new int[2];

        int i =0;
        int j = numbers.length-1;

        while(i < j){

            if(numbers[i] + numbers[j] == target){
                sol[0] = i+1;
                sol[1] = j+1;
                return sol;
            }

            if(numbers[i]+numbers[j] < target){
                i++;
            }else{
                j--;
            }


        }

        return sol;
        
    }
}
