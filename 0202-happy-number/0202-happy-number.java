class Solution {
    public boolean isHappy(int n) {
        int slow = n;
        int fast = n;
        do{
            slow = helper(slow);
            fast = helper(helper(fast));
        }while(slow != fast && fast !=1);
        if(fast == 1) return true;
        return false;
    }
    static int helper(int n){
        int ans = 0;
        while(n>0){
            ans += (int) Math.pow(n%10,2);
            n/=10;
        }
        return ans;
    }
}