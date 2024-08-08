class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        int k = n1+n2;
        int p = 0;
        int i = 0;
        int j = 0;
        int arr[] = new int[k];
        while(i<n1 && j<n2){
            if(nums1[i]<nums2[j]){
                arr[p++] = nums1[i++];
            }else{
                arr[p++] = nums2[j++];
            }
        }
        while(i<n1) arr[p++] = nums1[i++];
        while(j<n2) arr[p++] = nums2[j++];
        if(k%2 == 0) return ((double) arr[k/2]+(double) arr[k/2-1])/2;
        else return arr[k/2];
    }
}