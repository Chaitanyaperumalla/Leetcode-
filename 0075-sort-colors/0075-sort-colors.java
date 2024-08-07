class Solution {
public static void sortColors(int[] nums) {
    // for(int i = 0;i<nums.length;i++){
    //     for(int j = 0;j<nums.length-i-1;j++){
    //         if(nums[j]>nums[j+1]){
    //             int temp = nums[j];
    //             nums[j] = nums[j+1];
    //             nums[j+1] = temp;
    //         }
    //     }
    // }

    int z = 0;
        int o = 0;
        int t = 0;
        for(int i:nums){
            if(i == 0) z++;
            else if(i == 1)o++;
            else t++;
        }
        int k = 0;
        while(z--!=0) nums[k++] = 0;
        while(o--!=0) nums[k++] = 1;
        while(t--!=0) nums[k++] = 2;
}
}