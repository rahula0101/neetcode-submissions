class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        List<Integer>[] buckets = new List[nums.length];

        Map<Integer,Integer> freqMap = this.findFreq(nums);

        for(Integer n : freqMap.keySet()){

            int pos  = freqMap.get(n)-1;

           

            if(buckets[pos] == null){
                buckets[pos] = new ArrayList<>();
            }

            buckets[pos].add(n);

        }

        int[] sol = new int[k];

        int c = 0;

        for(int l= buckets.length-1; l>=0 ; l--){

            if(buckets[l] != null){

                List<Integer> entries = buckets[l];
                
                for(int n : entries){
                    sol[c++] = n;
                    if(c == k){
                        return sol;
                    }
                }


            }
        }


        return sol;
        
    }


    private Map<Integer,Integer> findFreq(int[] nums){

        Map<Integer,Integer> freqMap = new HashMap<>();

        for(int n: nums){
            if(freqMap.containsKey(n)){
                freqMap.put(n, freqMap.get(n)+1);
            }else{
                freqMap.put(n,1);
            }
        }

        return freqMap;

    }
}
