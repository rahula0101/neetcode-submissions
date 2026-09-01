class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

       Map<String,List<String>> solList = new HashMap<>();

       List<List<String>> sol = new ArrayList<>();

       for(String s : strs){

        int[] freqArr = this.getFrequencyArr(s);
        String freqStr = this.getFreqStr(freqArr);

        if(solList.containsKey(freqStr)){
            solList.get(freqStr).add(s);
        }else{
            List<String> arr = new ArrayList<>();
            arr.add(s);
            solList.put(freqStr,arr);
        }
       }

        for(String key : solList.keySet()){
            sol.add(solList.get(key));
        }

        return sol;


        
    }


    private int[] getFrequencyArr(String s){

        int[] arr = new int[26];

        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            arr[c-97] = arr[c-97]+1;

        }

        return arr;

    }


    private String getFreqStr(int[] freq){

        StringBuilder sb = new StringBuilder();

        for(int i=0; i<26 ;i++){
            char c = (char)(i+97);
            sb.append(c+"_"+freq[i]);
        }

        return sb.toString();
    }
}
