class Solution {
    public int singleNumber(int[] nums) {
        // int n = 0;
        // for(int i:nums) n ^= i;
        // return n;
       for(int i=0;i<nums.length;i++){
            boolean found = false;
            for(int j=0;j<nums.length;j++){
                if(i!=j && nums[i] == nums[j]){
                    found = true;
                    break;
                }
            }
            if(!found){
                return nums[i];
            }
        }
        return 0;
    }
}


// class Solution {
//     public int singleNumber(int[] nums) {
//         int n = 0;
//         for(int i=0;i<nums.length;i++){
//             n = n ^ nums[i];
//         }
//         return n;
//     }
// }

