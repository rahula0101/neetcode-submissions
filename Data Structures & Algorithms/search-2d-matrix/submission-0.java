class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        int rows = matrix.length;
        int cols = matrix[0].length;

        int total  = rows*cols;

        int l = 0;
        int r = total-1;

        while( l <= r){

            int mid = l + (r-l)/2;

            int rIndex = mid/cols;
            int cIndex = mid%cols;

            if(target == matrix[rIndex][cIndex]){
                return true;
            }else if(target < matrix[rIndex][cIndex]){
                r = mid-1;
            }else{
                l = mid+1;
            }

        }

        return false;
        
    }
}
