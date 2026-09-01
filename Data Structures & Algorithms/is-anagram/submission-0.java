class Solution {
    public boolean isAnagram(String s, String t) {

        Map<Character,Integer> freq = new HashMap<>();

        for(int i=0; i<s.length(); i++){
            freq.put(s.charAt(i), freq.getOrDefault(s.charAt(i),0)+1);
        }

        for(int i=0; i<t.length(); i++){
            if(!freq.containsKey(t.charAt(i))){
                return false;
            }

            if(freq.get(t.charAt(i)) == 1){
                freq.remove(t.charAt(i));
            }else{
                int val = freq.get(t.charAt(i));
                freq.put(t.charAt(i), --val);
            }
        }

        if(freq.isEmpty()){
            return true;
        }else{
            return false;
        }
    }
}
