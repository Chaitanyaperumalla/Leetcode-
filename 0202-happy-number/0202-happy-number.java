class Solution {
    public boolean isHappy(int n) {
        int d, s = 0;
        while (true) {
            while (n != 0) {
                d = n % 10;
                s = s + d * d;
                n = n / 10;
            }
            if (s <= 9) break;
            n = s;
            s = 0;
        }
        if (s == 1 || s == 7) return true;
        return false;
    }
}