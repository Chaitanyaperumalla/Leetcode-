class Solution {
    public int maxArea(int[] height) {
        int storage[] = new int[height.length];
        int index = 0;
        int left = 0;
        int right = height.length-1;
        while(right>left){
         if (height[left] > height[right]){
             int water = (right-left)*height[right];
             storage[index] = water;
             index ++;
             right --;
         }
        else{
            int water = (right-left)*height[left];
            storage[index] = water;
            index ++;
            left ++;
        }
}   
        int max = storage[0];
        for(int i=0;i<storage.length;i++){
            if (storage[i] > max){
                max = storage[i];
            }
            
        }
        return max;
}      
}