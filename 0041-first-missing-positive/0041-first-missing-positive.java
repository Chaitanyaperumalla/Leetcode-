class Solution {
    public int firstMissingPositive(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int k = 0;
        for(int i:nums){
            map.put(i,k++);
        }
        for(int i=1;i<=nums.length;i++){
            if(!map.containsKey(i)) return i;
        }
        return nums.length+1;
       
    }
}