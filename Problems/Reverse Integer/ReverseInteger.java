class Solution {
    public int reverse(int x) {

        long result = 0;

        while( x != 0 ){
            int lastDig = x % 10;
            result += lastDig;
            result = result * 10;
            x= x / 10; //integer division means any decimal value is discarded
        }

        result = result/10;

        if(result > Integer.MAX_VALUE || result < Integer.MIN_VALUE){
            return 0;
        }

        if( x < 0 ){
            return (int)(-1 * result);
        }

        return (int) result;
    }
}
