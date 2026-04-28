class Solution {
    public int lengthOfLongestSubstring(String s) {

        int counter = 1;
        int maxCount = 1;
        int jLimit = 0;

        if ( s.equals("") ){
            return 0;
        }

        for(int i = 0; i < s.length(); i++){
            if (counter > maxCount){
                maxCount = counter;
            }
            counter = 1;
            for (int j = i-1; j >= jLimit; j--){
                if (s.charAt(i) != s.charAt(j)){
                    counter++;
                }
                else{
                    jLimit = j+1;
                    break;
                }
            }
        }
        
        if (counter > maxCount){
                maxCount = counter;
            }

        return maxCount;
    }
}
