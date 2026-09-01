class Solution {
    public int scoreOfString(String s) {

        int sol = 0;
        
        for(int i=1, j=0; i<s.length() ; i++, j++){
            sol = sol + Math.abs((s.charAt(i) - s.charAt(j)));
            System.out.println(sol);
        }

        return sol;

    }
}