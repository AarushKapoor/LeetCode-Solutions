class Solution {
    public int strStr(String haystack, String needle) {
        int index;
        for (int i = 0; i < haystack.length(); i++){
            if (i+needle.length() > haystack.length()){
                return -1;
            }
            else if (haystack.substring(i, i+needle.length()).equals(needle)){
                return i;
            }
        }
        return -1;
    }
}
