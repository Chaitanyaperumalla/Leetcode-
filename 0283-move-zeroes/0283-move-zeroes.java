class Solution {
    public void moveZeroes(int[] nums) {
    //  int a=0;
    //  for(int i=0;i<nums.length;i++)
    //     if(nums[i]!=0)
    //         nums[a++]=nums[i];
     

    //  for(int i=a;i<nums.length;i++) nums[i]=0;

        int ind = -1;
        for(int i=0;i<nums.length;i++){
            if(nums[i] == 0){
                ind = i;
                break;
            }
        }
        
        if(ind == -1) return;
        
        int i = ind;
        int j = ind+1;
        while(j<nums.length){
            if(nums[j] != 0){
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                i++;
            }
            j++;
        }
    }
    
}