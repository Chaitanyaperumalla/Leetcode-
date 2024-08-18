class Solution {
    public int findClosestNumber(int[] nums){
        int ans = nums[0] , diff = Math.abs(nums[0]);
        for(int i=1; i<nums.length; i++){
            if(Math.abs(nums[i]) < diff){
                ans = nums[i];
                diff = Math.abs(nums[i]);
            }
            if(diff == Math.abs(nums[i]) && nums[i] > ans){
                ans = nums[i];
            }
        }
        return ans;



//      Another solution
        // int min=Integer.MAX_VALUE , res=0;
        // for(int i=0;i<nums.length;i++){
        //     if(Math.abs(nums[i])< min || nums[i]== Math.abs(min) ){
        //         min=Math.abs(nums[i]);
        //         res=nums[i];
        //     } 
        // }
        // return res;
    }
}

//   Another Solutions

//         Arrays.sort(nums);
//         int ans=0 , val=nums[0];
//         for(int i:nums){
//             if(i==0) return 0;
//             if(i>0){
//                 ans=i;
//                 break;
//             }
//             val=i;
//         }
//         if(ans==0)return nums[nums.length-1];
//         if(Math.abs(val)<ans)return val;
//         return ans;