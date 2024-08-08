class Solution {
    public void rotate(int[] nums, int k) {
        // int n = nums.length;
        // while(k--!=0){
        //     int temp=nums[n-1];
        //     for(int i=n-1;i>=1;i--) {
        //         nums[i]=nums[i-1];
        //     }
        //     nums[0]=temp;
            
        // }
        
        int n = nums.length;
        k = k % n;
        int l = 0;
        int temp[] = new int[n];
        for(int i=n-k;i<n;i++){
            temp[l++] = nums[i];
        }
        for(int i=0;i<n-k;i++){
            temp[l++] = nums[i];
        }
        for(int i=0;i<n;i++){
            nums[i] = temp[i];
        }
    }
}