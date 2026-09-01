class Solution {
    public boolean isAnagram(String s, String t) {

       if(s.length() != t.length()){
        return false;
       }

       Map<Character, Integer> charFreq = new HashMap<>();

       for(int i=0 ; i<s.length(); i++){
        Character c  = s.charAt(i);
        charFreq.put(c ,  charFreq.getOrDefault(c,0)+1);
       }

       for(int i=0 ; i<t.length(); i++){
          Character c  = t.charAt(i);
          if(charFreq.containsKey(c)){
            int count =  charFreq.get(c);
            if(count > 1){
                charFreq.put(c, count-1);
            }else{
                charFreq.remove(c);
            }

          }else{
            return false;
          }
       }

      if(charFreq.size() == 0){
        return true;
      }

      return false;

    }
}
