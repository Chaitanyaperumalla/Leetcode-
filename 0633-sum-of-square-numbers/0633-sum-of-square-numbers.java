class Solution {
    public boolean judgeSquareSum(int c) {
    int left = 0;
    int right = (int)Math.sqrt(c);
    while(left<=right){
        long temp = (long)left*left + (long)right*right;
        if(temp == c){
            return true;
        }else if(temp > c){
            right--;
        }else left++;
    }
    return false;
    }
}