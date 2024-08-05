class Solution {
    public int majorityElement(int[] nums) {
        // int votes = 1;
        // int element = nums[0];
        // for(int i=1;i<nums.length;i++){
        //     if(nums[i] == element){
        //         votes++;
        //     }else{
        //         votes--;
        //     }
        //     if(votes==0){
        //         element = nums[i];
        //         votes =1;
        //     }
        // }
        // return element;
     int count = 0;
        int candidate = 0;
        
        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            
            if (num == candidate) {
                count++;
            } else {
                count--;
            }
        }
        
        return candidate;
    }
}