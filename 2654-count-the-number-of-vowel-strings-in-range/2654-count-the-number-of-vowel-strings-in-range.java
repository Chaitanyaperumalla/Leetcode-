class Solution {
    public int vowelStrings(String[] words, int left, int right) {
        int count = 0;
        for (int i = left; i <= right; i++) {
            String word = words[i];
            if ("aeiou".indexOf(word.charAt(0)) != -1 && "aeiou".indexOf(word.charAt(word.length() - 1)) != -1) {
                count++;
            }
        }
        return count;
        
    }
}