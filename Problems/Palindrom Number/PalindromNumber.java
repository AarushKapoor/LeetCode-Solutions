class Solution {
    public boolean isPalindrome(int x) {
        String xString = Integer.toString(x);
        int xStringLength = Integer.toString(x).length();
        int j = xStringLength-1;
        for (int i = 0; i < xStringLength; i++){
            if (xString.charAt(i) != xString.charAt(j)){
                return false;
            }
            j--;
        }
        return true;
    }
}
