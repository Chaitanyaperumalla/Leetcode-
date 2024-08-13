class Solution {
    public boolean search(int[] nums, int target) {
        int low = 0;
        int high = nums.length-1;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(nums[mid] == target) return true;
            
            if(nums[mid] == nums[low] && nums[low] == nums[high]){
                low++;
                high--;
                continue;
            }
       
            // check if left is sorted
            else if(nums[mid]>=nums[low]){
                if(nums[mid]>target && nums[low]<=target){
                    high = mid-1;
                }else{
                    low = mid+1;
                }
            }else{
                if(nums[mid]<target && nums[high]>=target){
                    low = mid+1; 
                }else{
                    high = mid-1;
                }
            }
        }
        return false;
    }
}