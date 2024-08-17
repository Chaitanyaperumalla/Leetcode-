class Solution {
    public int trailingZeroes(int n) {
        int ans = 0;
        int temp = 5;
        while(n>=5){
            ans += n/5;
            n = n/temp;
        }
        return ans;
    }
}