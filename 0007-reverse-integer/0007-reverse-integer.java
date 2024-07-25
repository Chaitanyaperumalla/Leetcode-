class Solution {
    public int reverse(int x) {
        long temp = x;
        long rev = 0;
        boolean isNegative = temp > 0 ? false : true;
              temp = Math.abs(temp); // Take the absolute value of temp

        while(temp != 0){
            rev = rev * 10 + (temp%10);
            temp = temp/10;
        }
        if(isNegative) rev = -1*rev;
        if(rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE) return 0;
        return (int)rev;
    }
}