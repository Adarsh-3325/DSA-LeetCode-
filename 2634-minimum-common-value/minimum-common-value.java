class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        // HashSet<Integer> set = new HashSet<>();
        // for(int i=0;i<nums1.length;i++){
        //     set.add(nums1[i]);
        // }
        // for(int i=0;i<nums2.length;i++){
        //     if(set.contains(nums2[i])){
        //         return nums2[i];
        //     }
        // }
        // return -1;

        int left = 0;
        int right = 0;

        while(left < nums1.length && right < nums2.length){
            if(nums1[left] == nums2[right]){
                return nums1[left];
            }
            else if(nums1[left] > nums2[right]){
                right++;
            }
            else{
                left++;
            }
        }
        return -1;
    }
}