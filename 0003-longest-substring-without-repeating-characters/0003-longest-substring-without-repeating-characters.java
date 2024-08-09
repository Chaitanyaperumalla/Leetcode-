class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left  = 0;
        int right = 0;
        int len = 0;
        HashMap<Character,Integer> map = new HashMap<>();
        while(right<s.length()){
            char ch = s.charAt(right);
            if(map.containsKey(ch)){
                left = Math.max(left,map.get(ch)+1);
            }
            len = Math.max(right-left+1,len);

            map.put(ch,right);
            right++;
        }
        return len;
    }
}