class Solution {
    public int[] replaceElements(int[] arr) {

        int[] greatestArray = new int[arr.length];
        greatestArray[arr.length-1] = -1;
        
        int maxElement = arr[arr.length-1];

        for(int i= arr.length-2 ; i>=0 ; i--){
            greatestArray[i] =    maxElement;
            maxElement = Math.max(maxElement, arr[i]);
        }

        return greatestArray;


        
    }
}