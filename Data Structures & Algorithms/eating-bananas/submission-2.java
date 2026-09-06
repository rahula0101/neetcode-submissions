class Solution {
    public int minEatingSpeed(int[] piles, int h) {

        Arrays.sort(piles);

        int minRate = 1;
        int maxRate = piles[piles.length-1];


        int sol = maxRate;


        while(minRate <= maxRate){

            int mid = minRate + (maxRate-minRate)/2;

            if(checkIfallCanBeEaten(piles, h, mid)){

                sol = Math.min(sol, mid);

                maxRate = mid-1;
            }else{
                minRate = mid+1;
            }


        }

        return sol;
        
    }



    private boolean checkIfallCanBeEaten(int[] piles, int h, int rate){

        int total = 0;

        for(int p : piles){

           total += Math.ceil((double) p/rate);
        }

        if(total <= h){
            return true;
        }else{
            return false;
        }
    }
}
